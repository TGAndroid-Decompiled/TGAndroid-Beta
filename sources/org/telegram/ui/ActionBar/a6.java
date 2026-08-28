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
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.n9;
public final class a6 implements NotificationCenter.NotificationCenterDelegate {
    public static a6 f22738c;
    public int f22739a;
    public HashMap f22740b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f22738c != null && !z10) {
            return;
        }
        ArrayList arrayList2 = null;
        for (int i9 = 0; i9 < 5; i9++) {
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
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
            e6 e6Var = (e6) f6.H.get(str);
            if (e6Var != null && (arrayList = e6Var.X) != null && !arrayList.isEmpty()) {
                int size = e6Var.X.size();
                for (int i10 = 0; i10 < size; i10++) {
                    d6 d6Var = (d6) e6Var.X.get(i10);
                    if (d6Var.f22866a != f6.f23172n && !TextUtils.isEmpty(d6Var.f22878o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(d6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f22739a = UserConfig.selectedAccount;
        if (arrayList2 != null) {
            Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(6, obj, arrayList2));
        }
        f22738c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, d6 d6Var) {
        Bitmap bitmap2;
        int patternColor;
        Bitmap i12;
        int i9;
        int i10;
        int i11;
        try {
            File d = d6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            e6 e6Var = d6Var.f22867b;
            SparseIntArray Q0 = f6.Q0(null, e6Var.d, null);
            f6.G(Q0, e6Var);
            int i13 = d6Var.f22868c;
            int i14 = (int) d6Var.f22873j;
            long j10 = d6Var.f22874k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = Q0.get(f6.Od);
                if (i16 != 0) {
                    i15 = f6.B(e6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = d6Var.f22875l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i11 = Q0.get(f6.Pd)) != 0) {
                i17 = f6.B(e6Var, i13, i11);
            }
            long j12 = d6Var.f22876m;
            int i18 = (int) j12;
            if (i18 == 0 && j12 == 0 && (i10 = Q0.get(f6.Qd)) != 0) {
                i18 = f6.B(e6Var, i13, i10);
            }
            if (i14 == 0 && (i9 = Q0.get(f6.Nd)) != 0) {
                i14 = f6.B(e6Var, i13, i9);
            }
            if (i17 != 0) {
                patternColor = jb0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable n9Var = new n9(n9.d(d6Var.f22877n), new int[]{i14, i15});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i14, i15));
                drawable = n9Var;
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
                    i12 = SvgHelper.getBitmap(file, min, max, false, SvgHelper.ScaleMode.ByWidth);
                } else {
                    i12 = f6.i1(new FileInputStream(file), 0);
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
                    paint.setAlpha((int) (Math.abs(d6Var.f22879p) * 255.0f));
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(d));
                    return bitmap2;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(d);
                bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return bitmap2;
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
                return bitmap2;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap2 = bitmap;
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        HashMap hashMap = this.f22740b;
        if (hashMap != null) {
            if (i9 == NotificationCenter.fileLoaded) {
                z5 z5Var = (z5) hashMap.remove((String) objArr[0]);
                if (z5Var != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(7, this, z5Var));
                }
            } else if (i9 == NotificationCenter.fileLoadFailed && hashMap.remove((String) objArr[0]) != null) {
                AndroidUtilities.runOnUIThread(new gh.u5((Object) this, (Object) null, false, 8));
            }
        }
    }
}
