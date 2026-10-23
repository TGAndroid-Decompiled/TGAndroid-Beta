package org.telegram.ui.ActionBar;

import ai.y7;
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
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.yc0;
public final class f6 implements NotificationCenter.NotificationCenterDelegate {
    public static f6 f20892c;
    public int f20893a;
    public HashMap f20894b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f20892c != null && !z10) {
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
            if (j6Var != null && (arrayList = j6Var.f21022b0) != null && !arrayList.isEmpty()) {
                int size = j6Var.f21022b0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    i6 i6Var = (i6) j6Var.f21022b0.get(i11);
                    if (i6Var.f20964a != k6.f21359n && !TextUtils.isEmpty(i6Var.f20975o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(i6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f20893a = UserConfig.selectedAccount;
        if (arrayList2 != null) {
            Utilities.globalQueue.postRunnable(new m4.z(26, obj, arrayList2));
        }
        f20892c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, i6 i6Var) {
        Bitmap bitmap2;
        int patternColor;
        Bitmap l1;
        int i10;
        int i11;
        int i12;
        try {
            File d = i6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            j6 j6Var = i6Var.f20965b;
            SparseIntArray S0 = k6.S0(null, j6Var.d, null);
            k6.G(S0, j6Var);
            int i13 = i6Var.f20966c;
            int i14 = (int) i6Var.f20970j;
            long j10 = i6Var.f20971k;
            int i15 = (int) j10;
            if (i15 == 0 && j10 == 0) {
                if (i14 != 0) {
                    i13 = i14;
                }
                int i16 = S0.get(k6.Od);
                if (i16 != 0) {
                    i15 = k6.B(j6Var, i13, i16);
                }
            } else {
                i13 = 0;
            }
            long j11 = i6Var.f20972l;
            int i17 = (int) j11;
            if (i17 == 0 && j11 == 0 && (i12 = S0.get(k6.Pd)) != 0) {
                i17 = k6.B(j6Var, i13, i12);
            }
            long j12 = i6Var.f20973m;
            int i18 = (int) j12;
            if (i18 == 0 && j12 == 0 && (i11 = S0.get(k6.Qd)) != 0) {
                i18 = k6.B(j6Var, i13, i11);
            }
            if (i14 == 0 && (i10 = S0.get(k6.Nd)) != 0) {
                i14 = k6.B(j6Var, i13, i10);
            }
            if (i17 != 0) {
                patternColor = yc0.g(i14, i15, i17, i18);
            } else if (i15 != 0) {
                Drawable v9Var = new v9(v9.d(i6Var.f20974n), new int[]{i14, i15});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i14, i15));
                drawable = v9Var;
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
                    l1 = k6.l1(new FileInputStream(file), 0);
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
                    paint.setAlpha((int) (Math.abs(i6Var.f20976p) * 255.0f));
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
        HashMap hashMap = this.f20894b;
        if (hashMap != null) {
            if (i10 == NotificationCenter.fileLoaded) {
                e6 e6Var = (e6) hashMap.remove((String) objArr[0]);
                if (e6Var != null) {
                    Utilities.globalQueue.postRunnable(new m4.z(27, this, e6Var));
                }
            } else if (i10 == NotificationCenter.fileLoadFailed && hashMap.remove((String) objArr[0]) != null) {
                AndroidUtilities.runOnUIThread(new y7((Object) this, (Object) null, false, 13));
            }
        }
    }
}
