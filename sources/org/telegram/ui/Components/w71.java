package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.ui.WallpapersListActivity;

public final class w71 {

    public String f34135a;

    public final Activity f34136b;

    public final org.telegram.ui.ActionBar.n2 f34137c;
    public final v71 d;

    public File f34138e;

    public w71(Activity activity, WallpapersListActivity wallpapersListActivity, v71 v71Var) {
        this.f34136b = activity;
        this.f34137c = wallpapersListActivity;
        this.d = v71Var;
    }

    public final void a(int i10, int i11, Intent intent) {
        FileOutputStream fileOutputStream;
        if (i11 == -1) {
            ?? r10 = 10;
            v71 v71Var = this.d;
            ?? r11 = 0;
            if (i10 != 10) {
                if (i10 != 11 || intent == null || intent.getData() == null) {
                    return;
                }
                try {
                    this.f34138e = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(null, intent.getData(), (float) realScreenSize.x, (float) realScreenSize.y, true);
                    bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(this.f34138e));
                    v71Var.b(this.f34138e, bitmapLoadBitmap, false);
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            }
            AndroidUtilities.addMediaToGallery(this.f34135a);
            try {
                try {
                    this.f34138e = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize2 = AndroidUtilities.getRealScreenSize();
                    Bitmap bitmapLoadBitmap2 = ImageLoader.loadBitmap(this.f34135a, null, (float) realScreenSize2.x, (float) realScreenSize2.y, true);
                    fileOutputStream = new FileOutputStream(this.f34138e);
                    try {
                        bitmapLoadBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        v71Var.b(this.f34138e, bitmapLoadBitmap2, false);
                        r10 = fileOutputStream;
                    } catch (Exception e10) {
                        e = e10;
                        FileLog.e(e);
                        r10 = fileOutputStream;
                        if (fileOutputStream != null) {
                        }
                        this.f34135a = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    r11 = r10;
                    if (r11 != 0) {
                        try {
                            r11.close();
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (r11 != 0) {
                    r11.close();
                }
                throw th;
            }
            try {
                r10.close();
            } catch (Exception e13) {
                FileLog.e(e13);
            }
            this.f34135a = null;
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f34137c;
        if (n2Var == null) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.f34136b.startActivityForResult(intent, 11);
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        if (parentActivity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                    return;
                }
            } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        org.telegram.ui.jp0 jp0Var = new org.telegram.ui.jp0(2, false, false, null);
        jp0Var.f39470x = false;
        jp0Var.R = new u71(this);
        n2Var.presentFragment(jp0Var);
    }
}
