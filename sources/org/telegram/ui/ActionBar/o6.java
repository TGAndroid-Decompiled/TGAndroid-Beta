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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.e00;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.jb0;
public final class o6 implements vs {
    public static o6 f20630c;
    public int f20631a;
    public HashMap f20632b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f20630c != null && !z10) {
            return;
        }
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
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
            s6 s6Var = (s6) t6.H.get(str);
            if (s6Var != null && (arrayList = s6Var.f20805b0) != null && !arrayList.isEmpty()) {
                int size = s6Var.f20805b0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    r6 r6Var = (r6) s6Var.f20805b0.get(i11);
                    if (r6Var.f20731a != t6.f21109n && !TextUtils.isEmpty(r6Var.f20742o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(r6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f20631a = e20.f15506s0;
        if (arrayList2 != null) {
            Utilities.e.c(new mh.k(26, obj, arrayList2));
        }
        f20630c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, r6 r6Var) {
        Bitmap bitmap2;
        int V0;
        Bitmap n12;
        int i10;
        int i11;
        int i12;
        try {
            File e = r6Var.e();
            Drawable drawable = null;
            if (e == null) {
                return null;
            }
            s6 s6Var = r6Var.f20732b;
            SparseIntArray T0 = t6.T0(null, s6Var.d, null);
            t6.H(T0, s6Var);
            int i13 = r6Var.f20733c;
            int i14 = (int) r6Var.f20737j;
            long j10 = r6Var.f20738k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = T0.get(t6.Ce);
                if (i16 != 0) {
                    i15 = t6.C(s6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = r6Var.f20739l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i12 = T0.get(t6.De)) != 0) {
                i17 = t6.C(s6Var, i13, i12);
            }
            long j12 = r6Var.f20740m;
            int i18 = (int) j12;
            if (i18 == 0 && j12 == 0 && (i11 = T0.get(t6.Ee)) != 0) {
                i18 = t6.C(s6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = T0.get(t6.Be)) != 0) {
                i14 = t6.C(s6Var, i13, i10);
            }
            if (i17 != 0) {
                V0 = jb0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable f9Var = new f9(f9.d(r6Var.f20741n), new int[]{i14, i15});
                V0 = org.telegram.messenger.i0.V0(org.telegram.messenger.i0.w0(i14, i15), false);
                drawable = f9Var;
            } else {
                drawable = new ColorDrawable(i14);
                V0 = org.telegram.messenger.i0.V0(i14, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.i0.f16172q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                if (z10) {
                    n12 = e00.f(file, min, max, 2);
                } else {
                    n12 = t6.n1(new FileInputStream(file), 0);
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
                    paint.setAlpha((int) (Math.abs(r6Var.f20743p) * 255.0f));
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(e));
                    return bitmap2;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(e);
                bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return bitmap2;
            } catch (Throwable th2) {
                th = th2;
                f8.g(th, true);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        HashMap hashMap = this.f20632b;
        if (hashMap != null) {
            if (i10 == at.Y1) {
                n6 n6Var = (n6) hashMap.remove((String) objArr[0]);
                if (n6Var != null) {
                    Utilities.e.c(new mh.k(27, this, n6Var));
                }
            } else if (i10 == at.Z1 && hashMap.remove((String) objArr[0]) != null) {
                org.telegram.messenger.i0.g3(new ag.j0((Object) this, (Object) null, false, 10));
            }
        }
    }
}
