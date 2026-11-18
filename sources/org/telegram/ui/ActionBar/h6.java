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
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mz;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.p9;
public final class h6 implements fs {
    public static h6 f29000c;
    public int f29001a;
    public HashMap f29002b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f29000c != null && !z10) {
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
            m6 m6Var = (m6) n6.H.get(str);
            if (m6Var != null && (arrayList = m6Var.f29252c0) != null && !arrayList.isEmpty()) {
                int size = m6Var.f29252c0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    k6 k6Var = (k6) m6Var.f29252c0.get(i10);
                    if (k6Var.f29168a != n6.f29570n && !TextUtils.isEmpty(k6Var.f29180o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(k6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f29001a = j10.f24770t0;
        if (arrayList2 != null) {
            Utilities.f22779e.c(new a2(6, obj, arrayList2));
        }
        f29000c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, k6 k6Var) {
        Bitmap bitmap2;
        int V0;
        Bitmap n1;
        int i7;
        int i10;
        int i11;
        try {
            File e10 = k6Var.e();
            Drawable drawable = null;
            if (e10 == null) {
                return null;
            }
            m6 m6Var = k6Var.f29169b;
            SparseIntArray T0 = n6.T0(null, m6Var.d, null);
            n6.H(T0, m6Var);
            int i12 = k6Var.f29170c;
            int i13 = (int) k6Var.f29175j;
            long j3 = k6Var.f29176k;
            int i14 = (int) j3;
            if (i14 == 0 && j3 == 0) {
                if (i13 != 0) {
                    i12 = i13;
                }
                int i15 = T0.get(n6.Fe);
                if (i15 != 0) {
                    i14 = n6.C(m6Var, i12, i15);
                }
            } else {
                i12 = 0;
            }
            long j10 = k6Var.f29177l;
            int i16 = (int) j10;
            if (i16 == 0 && j10 == 0 && (i11 = T0.get(n6.Ge)) != 0) {
                i16 = n6.C(m6Var, i12, i11);
            }
            long j11 = k6Var.f29178m;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i10 = T0.get(n6.He)) != 0) {
                i17 = n6.C(m6Var, i12, i10);
            }
            if (i13 == 0 && (i7 = T0.get(n6.Ee)) != 0) {
                i13 = n6.C(m6Var, i12, i7);
            }
            if (i16 != 0) {
                V0 = bb0.g(i13, i14, i16, i17);
            } else if (i14 != 0) {
                Drawable p9Var = new p9(p9.d(k6Var.f29179n), new int[]{i13, i14});
                V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(i13, i14), false);
                drawable = p9Var;
            } else {
                drawable = new ColorDrawable(i13);
                V0 = org.telegram.messenger.g0.V0(i13, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.g0.f24118q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                if (z10) {
                    n1 = mz.f(file, min, max, 2);
                } else {
                    n1 = n6.n1(new FileInputStream(file), 0);
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
                    paint.setAlpha((int) (Math.abs(k6Var.f29181p) * 255.0f));
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
        HashMap hashMap = this.f29002b;
        if (hashMap != null) {
            if (i7 == ks.Y1) {
                g6 g6Var = (g6) hashMap.remove((String) objArr[0]);
                if (g6Var != null) {
                    Utilities.f22779e.c(new a2(7, this, g6Var));
                }
            } else if (i7 == ks.Z1 && hashMap.remove((String) objArr[0]) != null) {
                org.telegram.messenger.g0.g3(new di.p6((Object) this, (Object) null, false, 13));
            }
        }
    }
}
