package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class EmojiThemes$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final File f$0;
    public final Bitmap f$1;

    public EmojiThemes$$ExternalSyntheticLambda3(Bitmap bitmap, File file, int i) {
        this.$r8$classId = i;
        this.f$1 = bitmap;
        this.f$0 = file;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                File file = this.f$0;
                Bitmap bitmap = this.f$1;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                        fileOutputStream.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                try {
                    this.f$1.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f$0));
                    return;
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
            case 2:
                Bitmap bitmap2 = this.f$1;
                try {
                    try {
                        bitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f$0));
                        if (bitmap2.isRecycled()) {
                            return;
                        }
                        bitmap2.recycle();
                        return;
                    } catch (Exception e3) {
                        FileLog.e(e3);
                        if (bitmap2 == null || bitmap2.isRecycled()) {
                            return;
                        }
                        bitmap2.recycle();
                        return;
                    }
                } catch (Throwable th3) {
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    throw th3;
                }
            case 3:
                Bitmap bitmap3 = this.f$1;
                try {
                    bitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.f$0));
                } catch (Exception e4) {
                    FileLog.e(e4);
                } finally {
                    AndroidUtilities.recycleBitmap(bitmap3);
                }
                return;
            case 4:
                try {
                    this.f$1.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f$0));
                    return;
                } catch (Exception e5) {
                    FileLog.e(e5);
                    return;
                }
            default:
                try {
                    this.f$1.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(this.f$0));
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }

    public EmojiThemes$$ExternalSyntheticLambda3(File file, Bitmap bitmap) {
        this.$r8$classId = 0;
        this.f$0 = file;
        this.f$1 = bitmap;
    }
}
