package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.f8;
public final class w3 implements Runnable {
    public final int f21443a;
    public final Bitmap f21444b;
    public final File f21445c;

    public w3(Bitmap bitmap, File file, int i10) {
        this.f21443a = i10;
        this.f21444b = bitmap;
        this.f21445c = file;
    }

    @Override
    public final void run() {
        switch (this.f21443a) {
            case 0:
                File file = this.f21445c;
                Bitmap bitmap = this.f21444b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                try {
                    this.f21444b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f21445c));
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 2:
                Bitmap bitmap2 = this.f21444b;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f21445c));
                        if (bitmap2.isRecycled()) {
                            return;
                        }
                    } catch (Exception e10) {
                        f8.g(e10, true);
                        if (bitmap2.isRecycled()) {
                            return;
                        }
                    }
                    bitmap2.recycle();
                    return;
                } catch (Throwable th2) {
                    if (!bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    throw th2;
                }
            case 3:
                Bitmap bitmap3 = this.f21444b;
                try {
                    try {
                        bitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f21445c));
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                    return;
                } finally {
                    org.telegram.messenger.i0.z2(bitmap3);
                }
            case 4:
                try {
                    this.f21444b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f21445c));
                    return;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    return;
                }
            default:
                try {
                    this.f21444b.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f21445c));
                    return;
                } catch (Exception e13) {
                    f8.g(e13, true);
                    return;
                }
        }
    }

    public w3(File file, Bitmap bitmap) {
        this.f21443a = 0;
        this.f21445c = file;
        this.f21444b = bitmap;
    }
}
