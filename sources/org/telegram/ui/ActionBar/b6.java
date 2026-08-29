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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.yb0;
public final class b6 implements NotificationCenter.NotificationCenterDelegate {
    public static b6 f22768c;
    public int f22769a;
    public HashMap f22770b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f22768c != null && !z10) {
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
            f6 f6Var = (f6) g6.H.get(str);
            if (f6Var != null && (arrayList = f6Var.X) != null && !arrayList.isEmpty()) {
                int size = f6Var.X.size();
                for (int i11 = 0; i11 < size; i11++) {
                    e6 e6Var = (e6) f6Var.X.get(i11);
                    if (e6Var.f22902a != g6.f23234n && !TextUtils.isEmpty(e6Var.f22914o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(e6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f22769a = UserConfig.selectedAccount;
        if (arrayList2 != null) {
            Utilities.globalQueue.postRunnable(new c(3, obj, arrayList2));
        }
        f22768c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, e6 e6Var) {
        Bitmap bitmap2;
        int patternColor;
        Bitmap i12;
        int i10;
        int i11;
        int i13;
        try {
            File d = e6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            f6 f6Var = e6Var.f22903b;
            SparseIntArray Q0 = g6.Q0(null, f6Var.d, null);
            g6.G(Q0, f6Var);
            int i14 = e6Var.f22904c;
            int i15 = (int) e6Var.f22909j;
            long j10 = e6Var.f22910k;
            int i16 = (int) j10;
            if (i16 == 0 && j10 == 0) {
                if (i15 != 0) {
                    i14 = i15;
                }
                int i17 = Q0.get(g6.Od);
                if (i17 != 0) {
                    i16 = g6.B(f6Var, i14, i17);
                }
            } else {
                i14 = 0;
            }
            long j11 = e6Var.f22911l;
            int i18 = (int) j11;
            if (i18 == 0 && j11 == 0 && (i13 = Q0.get(g6.Pd)) != 0) {
                i18 = g6.B(f6Var, i14, i13);
            }
            long j12 = e6Var.f22912m;
            int i19 = (int) j12;
            if (i19 == 0 && j12 == 0 && (i11 = Q0.get(g6.Qd)) != 0) {
                i19 = g6.B(f6Var, i14, i11);
            }
            if (i15 == 0 && (i10 = Q0.get(g6.Nd)) != 0) {
                i15 = g6.B(f6Var, i14, i10);
            }
            if (i18 != 0) {
                patternColor = yb0.g(i15, i16, i18, i19);
            } else if (i16 != 0) {
                Drawable s9Var = new s9(s9.d(e6Var.f22913n), new int[]{i15, i16});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i15, i16));
                drawable = s9Var;
            } else {
                drawable = new ColorDrawable(i15);
                patternColor = AndroidUtilities.getPatternColor(i15);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                int max = Math.max(point2.x, point2.y);
                if (z10) {
                    i12 = SvgHelper.getBitmap(file, min, max, false, SvgHelper.ScaleMode.ByWidth);
                } else {
                    i12 = g6.i1(new FileInputStream(file), 0);
                }
                bitmap2 = i12;
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
                    paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                    paint.setAlpha((int) (Math.abs(e6Var.f22915p) * 255.0f));
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(d));
                    return bitmap2;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(d);
                bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return bitmap2;
            } catch (Throwable th2) {
                th = th2;
                FileLog.e(th);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        HashMap hashMap = this.f22770b;
        if (hashMap != null) {
            if (i10 == NotificationCenter.fileLoaded) {
                a6 a6Var = (a6) hashMap.remove((String) objArr[0]);
                if (a6Var != null) {
                    Utilities.globalQueue.postRunnable(new c(4, this, a6Var));
                }
            } else if (i10 == NotificationCenter.fileLoadFailed && hashMap.remove((String) objArr[0]) != null) {
                AndroidUtilities.runOnUIThread(new jh.r5((Object) this, (Object) null, false, 8));
            }
        }
    }
}
