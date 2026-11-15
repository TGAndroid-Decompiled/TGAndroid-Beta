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
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.qz;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ra0;
public final class d6 implements is {
    public static d6 f28507c;
    public int f28508a;
    public HashMap f28509b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f28507c != null && !z10) {
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
            i6 i6Var = (i6) j6.H.get(str);
            if (i6Var != null && (arrayList = i6Var.f28703c0) != null && !arrayList.isEmpty()) {
                int size = i6Var.f28703c0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g6 g6Var = (g6) i6Var.f28703c0.get(i10);
                    if (g6Var.f28602a != j6.f29025n && !TextUtils.isEmpty(g6Var.f28614o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(g6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f28508a = m10.f24940t0;
        if (arrayList2 != null) {
            Utilities.f22416e.c(new oi.u4(21, obj, arrayList2));
        }
        f28507c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, g6 g6Var) {
        Bitmap bitmap2;
        int V0;
        Bitmap n1;
        int i7;
        int i10;
        int i11;
        try {
            File e10 = g6Var.e();
            Drawable drawable = null;
            if (e10 == null) {
                return null;
            }
            i6 i6Var = g6Var.f28603b;
            SparseIntArray T0 = j6.T0(null, i6Var.d, null);
            j6.H(T0, i6Var);
            int i12 = g6Var.f28604c;
            int i13 = (int) g6Var.f28609j;
            long j3 = g6Var.f28610k;
            int i14 = (int) j3;
            if (i14 == 0 && j3 == 0) {
                if (i13 != 0) {
                    i12 = i13;
                }
                int i15 = T0.get(j6.Fe);
                if (i15 != 0) {
                    i14 = j6.C(i6Var, i12, i15);
                }
            } else {
                i12 = 0;
            }
            long j10 = g6Var.f28611l;
            int i16 = (int) j10;
            if (i16 == 0 && j10 == 0 && (i11 = T0.get(j6.Ge)) != 0) {
                i16 = j6.C(i6Var, i12, i11);
            }
            long j11 = g6Var.f28612m;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i10 = T0.get(j6.He)) != 0) {
                i17 = j6.C(i6Var, i12, i10);
            }
            if (i13 == 0 && (i7 = T0.get(j6.Ee)) != 0) {
                i13 = j6.C(i6Var, i12, i7);
            }
            if (i16 != 0) {
                V0 = ra0.g(i13, i14, i16, i17);
            } else if (i14 != 0) {
                Drawable h9Var = new h9(h9.d(g6Var.f28613n), new int[]{i13, i14});
                V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(i13, i14), false);
                drawable = h9Var;
            } else {
                drawable = new ColorDrawable(i13);
                V0 = org.telegram.messenger.g0.V0(i13, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.g0.f23611q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                if (z10) {
                    n1 = qz.f(file, min, max, 2);
                } else {
                    n1 = j6.n1(new FileInputStream(file), 0);
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
                    paint.setAlpha((int) (Math.abs(g6Var.f28615p) * 255.0f));
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
        HashMap hashMap = this.f28509b;
        if (hashMap != null) {
            if (i7 == ns.Y1) {
                c6 c6Var = (c6) hashMap.remove((String) objArr[0]);
                if (c6Var != null) {
                    Utilities.f22416e.c(new oi.u4(22, this, c6Var));
                }
            } else if (i7 == ns.Z1 && hashMap.remove((String) objArr[0]) != null) {
                org.telegram.messenger.g0.h3(new di.m6((Object) this, (Object) null, false, 13));
            }
        }
    }
}
