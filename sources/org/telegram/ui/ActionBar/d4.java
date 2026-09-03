package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class d4 implements Runnable {
    public final int f21275a;
    public final Bitmap f21276b;
    public final File f21277c;

    public d4(Bitmap bitmap, File file, int i10) {
        this.f21275a = i10;
        this.f21276b = bitmap;
        this.f21277c = file;
    }

    @Override
    public final void run() {
        switch (this.f21275a) {
            case 0:
                File file = this.f21277c;
                Bitmap bitmap = this.f21276b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                try {
                    this.f21276b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f21277c));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 2:
                Bitmap bitmap2 = this.f21276b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f21277c));
                        if (bitmap2.isRecycled()) {
                            return;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
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
                Bitmap bitmap3 = this.f21276b;
                try {
                    try {
                        bitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f21277c));
                    } finally {
                        AndroidUtilities.recycleBitmap(bitmap3);
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                return;
            case 4:
                try {
                    this.f21276b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f21277c));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            default:
                try {
                    this.f21276b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f21277c));
                    return;
                } catch (Exception e14) {
                    FileLog.e(e14);
                    return;
                }
        }
    }

    public d4(File file, Bitmap bitmap) {
        this.f21275a = 0;
        this.f21277c = file;
        this.f21276b = bitmap;
    }
}
