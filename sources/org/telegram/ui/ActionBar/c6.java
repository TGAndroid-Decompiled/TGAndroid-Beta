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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.x9;
public final class c6 implements NotificationCenter.NotificationCenterDelegate {
    public static c6 f20510c;
    public int f20511a;
    public HashMap f20512b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f20510c != null && !z10) {
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
            g6 g6Var = (g6) h6.H.get(str);
            if (g6Var != null && (arrayList = g6Var.f20658b0) != null && !arrayList.isEmpty()) {
                int size = g6Var.f20658b0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f6 f6Var = (f6) g6Var.f20658b0.get(i11);
                    if (f6Var.f20606a != h6.f20964n && !TextUtils.isEmpty(f6Var.f20618o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(f6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f20511a = UserConfig.selectedAccount;
        if (arrayList2 != null) {
            Utilities.globalQueue.postRunnable(new a6(0, obj, arrayList2));
        }
        f20510c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, f6 f6Var) {
        Bitmap bitmap2;
        int patternColor;
        Bitmap j12;
        int i10;
        int i11;
        int i12;
        try {
            File d = f6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            g6 g6Var = f6Var.f20607b;
            SparseIntArray R0 = h6.R0(null, g6Var.d, null);
            h6.G(R0, g6Var);
            int i13 = f6Var.f20608c;
            int i14 = (int) f6Var.f20613j;
            long j3 = f6Var.f20614k;
            int i15 = (int) j3;
            if (i15 == 0 && j3 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = R0.get(h6.Od);
                if (i16 != 0) {
                    i15 = h6.B(g6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j10 = f6Var.f20615l;
            int i17 = (int) j10;
            if (i17 == 0 && j10 == 0 && (i12 = R0.get(h6.Pd)) != 0) {
                i17 = h6.B(g6Var, i13, i12);
            }
            long j11 = f6Var.f20616m;
            int i18 = (int) j11;
            if (i18 == 0 && j11 == 0 && (i11 = R0.get(h6.Qd)) != 0) {
                i18 = h6.B(g6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = R0.get(h6.Nd)) != 0) {
                i14 = h6.B(g6Var, i13, i10);
            }
            if (i17 != 0) {
                patternColor = dd0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable x9Var = new x9(x9.d(f6Var.f20617n), new int[]{i14, i15});
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
                    j12 = SvgHelper.getBitmap(file, min, max, false, SvgHelper.ScaleMode.ByWidth);
                } else {
                    j12 = h6.j1(new FileInputStream(file), 0);
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
                    paint.setAlpha((int) (Math.abs(f6Var.f20619p) * 255.0f));
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
        HashMap hashMap = this.f20512b;
        if (hashMap != null) {
            if (i10 == NotificationCenter.fileLoaded) {
                b6 b6Var = (b6) hashMap.remove((String) objArr[0]);
                if (b6Var != null) {
                    Utilities.globalQueue.postRunnable(new a6(1, this, b6Var));
                }
            } else if (i10 == NotificationCenter.fileLoadFailed && hashMap.remove((String) objArr[0]) != null) {
                AndroidUtilities.runOnUIThread(new ci.x0((Object) this, (Object) null, false, 11));
            }
        }
    }
}
