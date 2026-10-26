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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.x9;
public final class t6 implements NotificationCenter.NotificationCenterDelegate {
    public static t6 f23105c;
    public int f23106a;
    public HashMap f23107b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f23105c != null && !z10) {
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
            x6 x6Var = (x6) y6.H.get(str);
            if (x6Var != null && (arrayList = x6Var.f23254b0) != null && !arrayList.isEmpty()) {
                int size = x6Var.f23254b0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    w6 w6Var = (w6) x6Var.f23254b0.get(i11);
                    if (w6Var.f23215a != y6.f23533n && !TextUtils.isEmpty(w6Var.f23226o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(w6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f23106a = UserConfig.selectedAccount;
        if (arrayList2 != null) {
            Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.m0(7, obj, arrayList2));
        }
        f23105c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, w6 w6Var) {
        Bitmap bitmap2;
        int patternColor;
        Bitmap l1;
        int i10;
        int i11;
        int i12;
        try {
            File d = w6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            x6 x6Var = w6Var.f23216b;
            SparseIntArray S0 = y6.S0(null, x6Var.d, null);
            y6.G(S0, x6Var);
            int i13 = w6Var.f23217c;
            int i14 = (int) w6Var.f23221j;
            long j10 = w6Var.f23222k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = S0.get(y6.Od);
                if (i16 != 0) {
                    i15 = y6.B(x6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = w6Var.f23223l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i12 = S0.get(y6.Pd)) != 0) {
                i17 = y6.B(x6Var, i13, i12);
            }
            long j12 = w6Var.f23224m;
            int i18 = (int) j12;
            if (i18 == 0 && j12 == 0 && (i11 = S0.get(y6.Qd)) != 0) {
                i18 = y6.B(x6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = S0.get(y6.Nd)) != 0) {
                i14 = y6.B(x6Var, i13, i10);
            }
            if (i17 != 0) {
                patternColor = uc0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable x9Var = new x9(x9.d(w6Var.f23225n), new int[]{i14, i15});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i14, i15));
                drawable = x9Var;
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
                    l1 = SvgHelper.getBitmap(file, min, max, false, SvgHelper.ScaleMode.ByWidth);
                } else {
                    l1 = y6.l1(new FileInputStream(file), 0);
                }
                bitmap2 = l1;
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
                    paint.setAlpha((int) (Math.abs(w6Var.f23227p) * 255.0f));
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
        HashMap hashMap = this.f23107b;
        if (hashMap != null) {
            if (i10 == NotificationCenter.fileLoaded) {
                s6 s6Var = (s6) hashMap.remove((String) objArr[0]);
                if (s6Var != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.m0(8, this, s6Var));
                }
            } else if (i10 == NotificationCenter.fileLoadFailed && hashMap.remove((String) objArr[0]) != null) {
                AndroidUtilities.runOnUIThread(new u7((Object) this, (Object) null, false, 13));
            }
        }
    }
}
