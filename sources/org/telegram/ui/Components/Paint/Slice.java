package org.telegram.ui.Components.Paint;

import android.graphics.RectF;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
public class Slice {
    private RectF bounds;
    private File file;

    public Slice(ByteBuffer byteBuffer, RectF rectF, DispatchQueue dispatchQueue) {
        this.bounds = rectF;
        try {
            this.file = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.file == null) {
            return;
        }
        storeData(byteBuffer);
    }

    public void cleanResources() {
        File file = this.file;
        if (file != null) {
            file.delete();
            this.file = null;
        }
    }

    private void storeData(ByteBuffer byteBuffer) {
        try {
            byte[] array = byteBuffer.array();
            FileOutputStream fileOutputStream = new FileOutputStream(this.file);
            Deflater deflater = new Deflater(1, true);
            deflater.setInput(array, byteBuffer.arrayOffset(), byteBuffer.remaining());
            deflater.finish();
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                fileOutputStream.write(bArr, 0, deflater.deflate(bArr));
            }
            deflater.end();
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public ByteBuffer getData() {
        try {
            byte[] bArr = new byte[1024];
            byte[] bArr2 = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream(this.file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Inflater inflater = new Inflater(true);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    inflater.setInput(bArr, 0, read);
                }
                while (true) {
                    int inflate = inflater.inflate(bArr2, 0, 1024);
                    if (inflate == 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, inflate);
                }
                if (!inflater.finished()) {
                    inflater.needsInput();
                } else {
                    inflater.end();
                    ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    byteArrayOutputStream.close();
                    fileInputStream.close();
                    return wrap;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public int getX() {
        return (int) this.bounds.left;
    }

    public int getY() {
        return (int) this.bounds.top;
    }

    public int getWidth() {
        return (int) this.bounds.width();
    }

    public int getHeight() {
        return (int) this.bounds.height();
    }
}
