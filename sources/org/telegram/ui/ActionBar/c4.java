package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class c4 implements Runnable {
    public final int f19521a;
    public final Bitmap f19522b;
    public final File f19523c;

    public c4(Bitmap bitmap, File file, int i10) {
        this.f19521a = i10;
        this.f19522b = bitmap;
        this.f19523c = file;
    }

    @Override
    public final void run() {
        switch (this.f19521a) {
            case 0:
                File file = this.f19523c;
                Bitmap bitmap = this.f19522b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                try {
                    this.f19522b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f19523c));
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 2:
                Bitmap bitmap2 = this.f19522b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f19523c));
                        if (bitmap2.isRecycled()) {
                            return;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (bitmap2 == null || bitmap2.isRecycled()) {
                            return;
                        }
                    }
                    bitmap2.recycle();
                    return;
                } catch (Throwable th2) {
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    throw th2;
                }
            case 3:
                Bitmap bitmap3 = this.f19522b;
                try {
                    try {
                        bitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f19523c));
                    } finally {
                        AndroidUtilities.recycleBitmap(bitmap3);
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                return;
            case 4:
                try {
                    this.f19522b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f19523c));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            default:
                try {
                    this.f19522b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f19523c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
        }
    }

    public c4(File file, Bitmap bitmap) {
        this.f19521a = 0;
        this.f19523c = file;
        this.f19522b = bitmap;
    }
}
