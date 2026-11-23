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
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.nz;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.p9;
public final class g6 implements gs {
    public static g6 f28986c;
    public int f28987a;
    public HashMap f28988b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f28986c != null && !z10) {
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
            l6 l6Var = (l6) m6.H.get(str);
            if (l6Var != null && (arrayList = l6Var.f29237c0) != null && !arrayList.isEmpty()) {
                int size = l6Var.f29237c0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    j6 j6Var = (j6) l6Var.f29237c0.get(i10);
                    if (j6Var.f29096a != m6.f29557n && !TextUtils.isEmpty(j6Var.f29108o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(j6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f28987a = k10.f24968t0;
        if (arrayList2 != null) {
            Utilities.f22810e.c(new z1(6, obj, arrayList2));
        }
        f28986c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, j6 j6Var) {
        Bitmap bitmap2;
        int V0;
        Bitmap n1;
        int i7;
        int i10;
        int i11;
        try {
            File e10 = j6Var.e();
            Drawable drawable = null;
            if (e10 == null) {
                return null;
            }
            l6 l6Var = j6Var.f29097b;
            SparseIntArray T0 = m6.T0(null, l6Var.d, null);
            m6.H(T0, l6Var);
            int i12 = j6Var.f29098c;
            int i13 = (int) j6Var.f29103j;
            long j3 = j6Var.f29104k;
            int i14 = (int) j3;
            if (i14 == 0 && j3 == 0) {
                if (i13 != 0) {
                    i12 = i13;
                }
                int i15 = T0.get(m6.Fe);
                if (i15 != 0) {
                    i14 = m6.C(l6Var, i12, i15);
                }
            } else {
                i12 = 0;
            }
            long j10 = j6Var.f29105l;
            int i16 = (int) j10;
            if (i16 == 0 && j10 == 0 && (i11 = T0.get(m6.Ge)) != 0) {
                i16 = m6.C(l6Var, i12, i11);
            }
            long j11 = j6Var.f29106m;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i10 = T0.get(m6.He)) != 0) {
                i17 = m6.C(l6Var, i12, i10);
            }
            if (i13 == 0 && (i7 = T0.get(m6.Ee)) != 0) {
                i13 = m6.C(l6Var, i12, i7);
            }
            if (i16 != 0) {
                V0 = cb0.g(i13, i14, i16, i17);
            } else if (i14 != 0) {
                Drawable p9Var = new p9(p9.d(j6Var.f29107n), new int[]{i13, i14});
                V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(i13, i14), false);
                drawable = p9Var;
            } else {
                drawable = new ColorDrawable(i13);
                V0 = org.telegram.messenger.g0.V0(i13, false);
            }
            if (bitmap == null) {
                Point point = org.telegram.messenger.g0.f24046q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                if (z10) {
                    n1 = nz.f(file, min, max, 2);
                } else {
                    n1 = m6.n1(new FileInputStream(file), 0);
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
                    paint.setAlpha((int) (Math.abs(j6Var.f29109p) * 255.0f));
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
        HashMap hashMap = this.f28988b;
        if (hashMap != null) {
            if (i7 == ls.Y1) {
                f6 f6Var = (f6) hashMap.remove((String) objArr[0]);
                if (f6Var != null) {
                    Utilities.f22810e.c(new z1(7, this, f6Var));
                }
            } else if (i7 == ls.Z1 && hashMap.remove((String) objArr[0]) != null) {
                org.telegram.messenger.g0.g3(new di.p6((Object) this, (Object) null, false, 13));
            }
        }
    }
}
