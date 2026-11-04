package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import ci.v6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.kz;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.la0;
public final class d6 implements cs {
    public static d6 f27464c;
    public int f27465a;
    public HashMap f27466b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f27464c != null && !z10) {
            return;
        }
        ArrayList arrayList2 = null;
        for (int i3 = 0; i3 < 5; i3++) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            str = "Night";
                        } else {
                            str = "Day";
                        }
                    } else {
                        str = "Arctic Blue";
                    }
                } else {
                    str = "Dark Blue";
                }
            } else {
                str = "Blue";
            }
            j6 j6Var = (j6) k6.H.get(str);
            if (j6Var != null && (arrayList = j6Var.f27680c0) != null && !arrayList.isEmpty()) {
                int size = j6Var.f27680c0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g6 g6Var = (g6) j6Var.f27680c0.get(i10);
                    if (g6Var.f27525a != k6.f28056n && !TextUtils.isEmpty(g6Var.f27537o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(g6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f27465a = h10.f22829t0;
        if (arrayList2 != null) {
            Utilities.f21387e.c(new org.telegram.messenger.voip.l0(7, obj, arrayList2));
        }
        f27464c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, g6 g6Var) {
        Bitmap bitmap2;
        int V0;
        Bitmap n12;
        int i3;
        int i10;
        int i11;
        try {
            File e10 = g6Var.e();
            Drawable drawable = null;
            if (e10 == null) {
                return null;
            }
            j6 j6Var = g6Var.f27526b;
            SparseIntArray T0 = k6.T0(null, j6Var.d, null);
            k6.H(T0, j6Var);
            int i12 = g6Var.f27527c;
            int i13 = (int) g6Var.f27532j;
            long j10 = g6Var.f27533k;
            int i14 = (int) j10;
            if (i14 == 0 && j10 == 0) {
                if (i13 != 0) {
                    i12 = i13;
                }
                int i15 = T0.get(k6.Ce);
                if (i15 != 0) {
                    i14 = k6.C(j6Var, i12, i15);
                }
            } else {
                i12 = 0;
            }
            long j11 = g6Var.f27534l;
            int i16 = (int) j11;
            if (i16 == 0 && j11 == 0 && (i11 = T0.get(k6.De)) != 0) {
                i16 = k6.C(j6Var, i12, i11);
            }
            long j12 = g6Var.f27535m;
            int i17 = (int) j12;
            if (i17 == 0 && j12 == 0 && (i10 = T0.get(k6.Ee)) != 0) {
                i17 = k6.C(j6Var, i12, i10);
            }
            if (i13 == 0 && (i3 = T0.get(k6.Be)) != 0) {
                i13 = k6.C(j6Var, i12, i3);
            }
            if (i16 != 0) {
                V0 = la0.g(i13, i14, i16, i17);
            } else if (i14 != 0) {
                Drawable j9Var = new j9(j9.d(g6Var.f27536n), new int[]{i13, i14});
                V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(i13, i14), false);
                drawable = j9Var;
            } else {
                drawable = new ColorDrawable(i13);
                V0 = org.telegram.messenger.g0.V0(i13, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.g0.f22608q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                if (z10) {
                    n12 = kz.f(file, min, max, 2);
                } else {
                    n12 = k6.n1(new FileInputStream(file), 0);
                }
                bitmap2 = n12;
            } else {
                bitmap2 = bitmap;
            }
            try {
                if (drawable != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                    drawable.draw(canvas);
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(V0, PorterDuff.Mode.SRC_IN));
                    paint.setAlpha((int) (Math.abs(g6Var.f27538p) * 255.0f));
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(e10));
                    return bitmap2;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(e10);
                bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return bitmap2;
            } catch (Throwable th2) {
                th = th2;
                a8.g(th, true);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        HashMap hashMap = this.f27466b;
        if (hashMap != null) {
            if (i3 == hs.Y1) {
                c6 c6Var = (c6) hashMap.remove((String) objArr[0]);
                if (c6Var != null) {
                    Utilities.f21387e.c(new org.telegram.messenger.voip.l0(8, this, c6Var));
                }
            } else if (i3 == hs.Z1 && hashMap.remove((String) objArr[0]) != null) {
                org.telegram.messenger.g0.h3(new v6((Object) this, (Object) null, false, 13));
            }
        }
    }
}
