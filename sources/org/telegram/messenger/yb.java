package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
public final class yb implements Runnable {
    public final File f26558a;
    public final int f26559b;
    public final xb f26560c;
    public final zb d;

    public yb(zb zbVar, int i3, File file, xb xbVar) {
        this.d = zbVar;
        this.f26559b = i3;
        this.f26558a = file;
        this.f26560c = xbVar;
    }

    public final void a() {
        this.d.f26773s.c(new y4(20, this, w7.r(null, this.f26560c.f26357a)));
    }

    @Override
    public final void run() {
        int min;
        int i3;
        Bitmap createScaledBitmap;
        File file = this.f26558a;
        xb xbVar = this.f26560c;
        try {
            String str = "q_" + xbVar.f26357a.dc_id + "_" + xbVar.f26357a.f27007id;
            File file2 = new File(w7.z(4), str + ".jpg");
            if (!file2.exists() && file.exists()) {
                if (xbVar.f26360e) {
                    Point point = g0.f22608q;
                    min = Math.max(point.x, point.y);
                } else {
                    Point point2 = g0.f22608q;
                    min = Math.min(180, Math.min(point2.x, point2.y) / 4);
                }
                int i10 = this.f26559b;
                Bitmap bitmap = null;
                if (i10 == 0) {
                    String file3 = file.toString();
                    float f10 = min;
                    bitmap = zb.K(file3, null, f10, f10, false);
                } else {
                    int i11 = 2;
                    if (i10 == 2) {
                        String file4 = file.toString();
                        if (!xbVar.f26360e) {
                            i11 = 1;
                        }
                        bitmap = yy.r(i11, file4);
                    } else if (i10 == 3) {
                        String lowerCase = file.toString().toLowerCase();
                        if (lowerCase.endsWith("mp4")) {
                            String file5 = file.toString();
                            if (!xbVar.f26360e) {
                                i11 = 1;
                            }
                            bitmap = yy.r(i11, file5);
                        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                            float f11 = min;
                            bitmap = zb.K(lowerCase, null, f11, f11, false);
                        }
                    }
                }
                if (bitmap == null) {
                    a();
                    return;
                }
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width != 0 && height != 0) {
                    float f12 = width;
                    float f13 = min;
                    float f14 = height;
                    float min2 = Math.min(f12 / f13, f14 / f13);
                    if (min2 > 1.0f && (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f12 / min2), (int) (f14 / min2), true)) != bitmap) {
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (xbVar.f26360e) {
                        i3 = 83;
                    } else {
                        i3 = 60;
                    }
                    bitmap.compress(compressFormat, i3, fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    g0.h3(new cn(this, str, new ArrayList(xbVar.f26359c), new BitmapDrawable(bitmap), new ArrayList(xbVar.d), 4));
                    return;
                }
                a();
                return;
            }
            a();
        } catch (Throwable th2) {
            a8.g(th2, true);
            a();
        }
    }
}
