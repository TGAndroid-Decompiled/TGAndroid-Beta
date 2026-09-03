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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.o9;
public final class f6 implements NotificationCenter.NotificationCenterDelegate {
    public static f6 f21366c;
    public int f21367a;
    public HashMap f21368b;

    public static void a(boolean z4) {
        String str;
        ArrayList arrayList;
        if (f21366c != null && !z4) {
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
            j6 j6Var = (j6) k6.H.get(str);
            if (j6Var != null && (arrayList = j6Var.Y) != null && !arrayList.isEmpty()) {
                int size = j6Var.Y.size();
                for (int i11 = 0; i11 < size; i11++) {
                    i6 i6Var = (i6) j6Var.Y.get(i11);
                    if (i6Var.f21469a != k6.f21834n && !TextUtils.isEmpty(i6Var.f21481o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(i6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f21367a = UserConfig.selectedAccount;
        if (arrayList2 != null) {
            Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.h(10, obj, arrayList2));
        }
        f21366c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z4, File file, i6 i6Var) {
        Bitmap bitmap2;
        int patternColor;
        Bitmap i12;
        int i10;
        int i11;
        int i13;
        try {
            File d = i6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            j6 j6Var = i6Var.f21470b;
            SparseIntArray Q0 = k6.Q0(null, j6Var.d, null);
            k6.G(Q0, j6Var);
            int i14 = i6Var.f21471c;
            int i15 = (int) i6Var.f21476j;
            long j10 = i6Var.f21477k;
            int i16 = (int) j10;
            if (i16 == 0 && j10 == 0) {
                if (i15 != 0) {
                    i14 = i15;
                }
                int i17 = Q0.get(k6.Od);
                if (i17 != 0) {
                    i16 = k6.B(j6Var, i14, i17);
                }
            } else {
                i14 = 0;
            }
            long j11 = i6Var.f21478l;
            int i18 = (int) j11;
            if (i18 == 0 && j11 == 0 && (i13 = Q0.get(k6.Pd)) != 0) {
                i18 = k6.B(j6Var, i14, i13);
            }
            long j12 = i6Var.f21479m;
            int i19 = (int) j12;
            if (i19 == 0 && j12 == 0 && (i11 = Q0.get(k6.Qd)) != 0) {
                i19 = k6.B(j6Var, i14, i11);
            }
            if (i15 == 0 && (i10 = Q0.get(k6.Nd)) != 0) {
                i15 = k6.B(j6Var, i14, i10);
            }
            if (i18 != 0) {
                patternColor = fc0.g(i15, i16, i18, i19);
            } else if (i16 != 0) {
                Drawable o9Var = new o9(o9.d(i6Var.f21480n), new int[]{i15, i16});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i15, i16));
                drawable = o9Var;
            } else {
                drawable = new ColorDrawable(i15);
                patternColor = AndroidUtilities.getPatternColor(i15);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                int max = Math.max(point2.x, point2.y);
                if (z4) {
                    i12 = SvgHelper.getBitmap(file, min, max, false, SvgHelper.ScaleMode.ByWidth);
                } else {
                    i12 = k6.i1(new FileInputStream(file), 0);
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
                    paint.setAlpha((int) (Math.abs(i6Var.f21482p) * 255.0f));
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
        HashMap hashMap = this.f21368b;
        if (hashMap != null) {
            if (i10 == NotificationCenter.fileLoaded) {
                e6 e6Var = (e6) hashMap.remove((String) objArr[0]);
                if (e6Var != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.h(11, this, e6Var));
                }
            } else if (i10 == NotificationCenter.fileLoadFailed && hashMap.remove((String) objArr[0]) != null) {
                AndroidUtilities.runOnUIThread(new mh.r5((Object) this, (Object) null, false, 6));
            }
        }
    }
}
