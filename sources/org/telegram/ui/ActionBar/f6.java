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
import bi.u7;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.sz;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ra0;
public final class f6 implements ls {
    public static f6 f27472c;
    public int f27473a;
    public HashMap f27474b;

    public static void a(boolean z9) {
        String str;
        ArrayList arrayList;
        if (f27472c != null && !z9) {
            return;
        }
        ArrayList arrayList2 = null;
        for (int i7 = 0; i7 < 5; i7++) {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
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
            k6 k6Var = (k6) l6.H.get(str);
            if (k6Var != null && (arrayList = k6Var.f27739b0) != null && !arrayList.isEmpty()) {
                int size = k6Var.f27739b0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    i6 i6Var = (i6) k6Var.f27739b0.get(i10);
                    if (i6Var.f27571a != l6.f28041n && !TextUtils.isEmpty(i6Var.f27583o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(i6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f27473a = p10.f24470s0;
        if (arrayList2 != null) {
            Utilities.f21336e.c(new p(2, obj, arrayList2));
        }
        f27472c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z9, File file, i6 i6Var) {
        Bitmap bitmap2;
        int V0;
        Bitmap n1;
        int i7;
        int i10;
        int i11;
        try {
            File e10 = i6Var.e();
            Drawable drawable = null;
            if (e10 == null) {
                return null;
            }
            k6 k6Var = i6Var.f27572b;
            SparseIntArray T0 = l6.T0(null, k6Var.d, null);
            l6.H(T0, k6Var);
            int i12 = i6Var.f27573c;
            int i13 = (int) i6Var.f27578j;
            long j3 = i6Var.f27579k;
            int i14 = (int) j3;
            if (i14 == 0 && j3 == 0) {
                if (i13 != 0) {
                    i12 = i13;
                }
                int i15 = T0.get(l6.Ce);
                if (i15 != 0) {
                    i14 = l6.C(k6Var, i12, i15);
                }
            } else {
                i12 = 0;
            }
            long j10 = i6Var.f27580l;
            int i16 = (int) j10;
            if (i16 == 0 && j10 == 0 && (i11 = T0.get(l6.De)) != 0) {
                i16 = l6.C(k6Var, i12, i11);
            }
            long j11 = i6Var.f27581m;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i10 = T0.get(l6.Ee)) != 0) {
                i17 = l6.C(k6Var, i12, i10);
            }
            if (i13 == 0 && (i7 = T0.get(l6.Be)) != 0) {
                i13 = l6.C(k6Var, i12, i7);
            }
            if (i16 != 0) {
                V0 = ra0.g(i13, i14, i16, i17);
            } else if (i14 != 0) {
                Drawable k9Var = new k9(k9.d(i6Var.f27582n), new int[]{i13, i14});
                V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(i13, i14), false);
                drawable = k9Var;
            } else {
                drawable = new ColorDrawable(i13);
                V0 = org.telegram.messenger.g0.V0(i13, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.g0.f22563q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                if (z9) {
                    n1 = sz.f(file, min, max, 2);
                } else {
                    n1 = l6.n1(new FileInputStream(file), 0);
                }
                bitmap2 = n1;
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
                    paint.setAlpha((int) (Math.abs(i6Var.f27584p) * 255.0f));
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
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        HashMap hashMap = this.f27474b;
        if (hashMap != null) {
            if (i7 == qs.Y1) {
                e6 e6Var = (e6) hashMap.remove((String) objArr[0]);
                if (e6Var != null) {
                    Utilities.f21336e.c(new p(3, this, e6Var));
                }
            } else if (i7 == qs.Z1 && hashMap.remove((String) objArr[0]) != null) {
                org.telegram.messenger.g0.h3(new u7((Object) this, (Object) null, false, 13));
            }
        }
    }
}
