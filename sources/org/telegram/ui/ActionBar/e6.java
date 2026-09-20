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
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.u9;
public final class e6 implements NotificationCenter.NotificationCenterDelegate {
    public static e6 f18836c;
    public int f18837a;
    public HashMap f18838b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f18836c != null && !z10) {
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
            i6 i6Var = (i6) j6.H.get(str);
            if (i6Var != null && (arrayList = i6Var.f18976b0) != null && !arrayList.isEmpty()) {
                int size = i6Var.f18976b0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    h6 h6Var = (h6) i6Var.f18976b0.get(i11);
                    if (h6Var.f18927a != j6.f19272n && !TextUtils.isEmpty(h6Var.f18938o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(h6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f18837a = UserConfig.selectedAccount;
        if (arrayList2 != null) {
            Utilities.globalQueue.postRunnable(new c6(0, obj, arrayList2));
        }
        f18836c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, h6 h6Var) {
        Bitmap bitmap2;
        int patternColor;
        Bitmap i12;
        int i10;
        int i11;
        int i13;
        try {
            File d = h6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            i6 i6Var = h6Var.f18928b;
            SparseIntArray Q0 = j6.Q0(null, i6Var.d, null);
            j6.G(Q0, i6Var);
            int i14 = h6Var.f18929c;
            int i15 = (int) h6Var.f18933j;
            long j3 = h6Var.f18934k;
            int i16 = (int) j3;
            if (i16 == 0 && j3 == 0) {
                if (i15 != 0) {
                    i14 = i15;
                }
                int i17 = Q0.get(j6.Od);
                if (i17 != 0) {
                    i16 = j6.B(i6Var, i14, i17);
                }
            } else {
                i14 = 0;
            }
            long j10 = h6Var.f18935l;
            int i18 = (int) j10;
            if (i18 == 0 && j10 == 0 && (i13 = Q0.get(j6.Pd)) != 0) {
                i18 = j6.B(i6Var, i14, i13);
            }
            long j11 = h6Var.f18936m;
            int i19 = (int) j11;
            if (i19 == 0 && j11 == 0 && (i11 = Q0.get(j6.Qd)) != 0) {
                i19 = j6.B(i6Var, i14, i11);
            }
            if (i15 == 0 && (i10 = Q0.get(j6.Nd)) != 0) {
                i15 = j6.B(i6Var, i14, i10);
            }
            if (i18 != 0) {
                patternColor = kc0.g(i15, i16, i18, i19);
            } else if (i16 != 0) {
                Drawable u9Var = new u9(u9.d(h6Var.f18937n), new int[]{i15, i16});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i15, i16));
                drawable = u9Var;
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
                    i12 = j6.i1(new FileInputStream(file), 0);
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
                    paint.setAlpha((int) (Math.abs(h6Var.f18939p) * 255.0f));
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
        HashMap hashMap = this.f18838b;
        if (hashMap != null) {
            if (i10 == NotificationCenter.fileLoaded) {
                d6 d6Var = (d6) hashMap.remove((String) objArr[0]);
                if (d6Var != null) {
                    Utilities.globalQueue.postRunnable(new c6(1, this, d6Var));
                }
            } else if (i10 == NotificationCenter.fileLoadFailed && hashMap.remove((String) objArr[0]) != null) {
                AndroidUtilities.runOnUIThread(new ci.y0((Object) this, (Object) null, false, 11));
            }
        }
    }
}
