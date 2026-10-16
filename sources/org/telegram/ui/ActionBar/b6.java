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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.y9;
public final class b6 implements NotificationCenter.NotificationCenterDelegate {
    public static b6 f19347c;
    public int f19348a;
    public HashMap f19349b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f19347c != null && !z10) {
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
            if (f6Var != null && (arrayList = f6Var.f19494b0) != null && !arrayList.isEmpty()) {
                int size = f6Var.f19494b0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    e6 e6Var = (e6) f6Var.f19494b0.get(i11);
                    if (e6Var.f19445a != g6.f19777n && !TextUtils.isEmpty(e6Var.f19456o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(e6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f19348a = UserConfig.selectedAccount;
        if (arrayList2 != null) {
            Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.p0(7, obj, arrayList2));
        }
        f19347c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, e6 e6Var) {
        Bitmap bitmap2;
        int patternColor;
        Bitmap j12;
        int i10;
        int i11;
        int i12;
        try {
            File d = e6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            f6 f6Var = e6Var.f19446b;
            SparseIntArray R0 = g6.R0(null, f6Var.d, null);
            g6.G(R0, f6Var);
            int i13 = e6Var.f19447c;
            int i14 = (int) e6Var.f19451j;
            long j10 = e6Var.f19452k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = R0.get(g6.Od);
                if (i16 != 0) {
                    i15 = g6.B(f6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = e6Var.f19453l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i12 = R0.get(g6.Pd)) != 0) {
                i17 = g6.B(f6Var, i13, i12);
            }
            long j13 = e6Var.f19454m;
            int i18 = (int) j13;
            if (i18 == 0 && j13 == 0 && (i11 = R0.get(g6.Qd)) != 0) {
                i18 = g6.B(f6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = R0.get(g6.Nd)) != 0) {
                i14 = g6.B(f6Var, i13, i10);
            }
            if (i17 != 0) {
                patternColor = cd0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable y9Var = new y9(y9.d(e6Var.f19455n), new int[]{i14, i15});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i14, i15));
                drawable = y9Var;
            } else {
                drawable = new ColorDrawable(i14);
                patternColor = AndroidUtilities.getPatternColor(i14);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                int max = Math.max(point2.x, point2.y);
                if (z10) {
                    j12 = SvgHelper.getBitmap(file, min, max, false, SvgHelper.ScaleMode.ByWidth);
                } else {
                    j12 = g6.j1(new FileInputStream(file), 0);
                }
                bitmap2 = j12;
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
                    paint.setAlpha((int) (Math.abs(e6Var.f19457p) * 255.0f));
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
        HashMap hashMap = this.f19349b;
        if (hashMap != null) {
            if (i10 == NotificationCenter.fileLoaded) {
                a6 a6Var = (a6) hashMap.remove((String) objArr[0]);
                if (a6Var != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.p0(8, this, a6Var));
                }
            } else if (i10 == NotificationCenter.fileLoadFailed && hashMap.remove((String) objArr[0]) != null) {
                AndroidUtilities.runOnUIThread(new di.x0((Object) this, (Object) null, false, 10));
            }
        }
    }
}
