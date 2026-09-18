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
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.v9;
public final class d6 implements NotificationCenter.NotificationCenterDelegate {
    public static d6 f18779c;
    public int f18780a;
    public HashMap f18781b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f18779c != null && !z10) {
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
            if (i6Var != null && (arrayList = i6Var.f18944b0) != null && !arrayList.isEmpty()) {
                int size = i6Var.f18944b0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    g6 g6Var = (g6) i6Var.f18944b0.get(i11);
                    if (g6Var.f18877a != j6.f19240n && !TextUtils.isEmpty(g6Var.f18888o)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(g6Var);
                    }
                }
            }
        }
        ?? obj = new Object();
        obj.f18780a = UserConfig.selectedAccount;
        if (arrayList2 != null) {
            Utilities.globalQueue.postRunnable(new ki.c0(28, (Object) obj, arrayList2));
        }
        f18779c = obj;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, g6 g6Var) {
        Bitmap bitmap2;
        int patternColor;
        Bitmap i12;
        int i10;
        int i11;
        int i13;
        try {
            File d = g6Var.d();
            Drawable drawable = null;
            if (d == null) {
                return null;
            }
            i6 i6Var = g6Var.f18878b;
            SparseIntArray Q0 = j6.Q0(null, i6Var.d, null);
            j6.G(Q0, i6Var);
            int i14 = g6Var.f18879c;
            int i15 = (int) g6Var.f18883j;
            long j3 = g6Var.f18884k;
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
            long j10 = g6Var.f18885l;
            int i18 = (int) j10;
            if (i18 == 0 && j10 == 0 && (i13 = Q0.get(j6.Pd)) != 0) {
                i18 = j6.B(i6Var, i14, i13);
            }
            long j11 = g6Var.f18886m;
            int i19 = (int) j11;
            if (i19 == 0 && j11 == 0 && (i11 = Q0.get(j6.Qd)) != 0) {
                i19 = j6.B(i6Var, i14, i11);
            }
            if (i15 == 0 && (i10 = Q0.get(j6.Nd)) != 0) {
                i15 = j6.B(i6Var, i14, i10);
            }
            if (i18 != 0) {
                patternColor = lc0.g(i15, i16, i18, i19);
            } else if (i16 != 0) {
                Drawable v9Var = new v9(v9.d(g6Var.f18887n), new int[]{i15, i16});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i15, i16));
                drawable = v9Var;
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
                    paint.setAlpha((int) (Math.abs(g6Var.f18889p) * 255.0f));
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
        HashMap hashMap = this.f18781b;
        if (hashMap != null) {
            if (i10 == NotificationCenter.fileLoaded) {
                c6 c6Var = (c6) hashMap.remove((String) objArr[0]);
                if (c6Var != null) {
                    Utilities.globalQueue.postRunnable(new ki.c0(29, this, c6Var));
                }
            } else if (i10 == NotificationCenter.fileLoadFailed && hashMap.remove((String) objArr[0]) != null) {
                AndroidUtilities.runOnUIThread(new ci.y0((Object) this, (Object) null, false, 11));
            }
        }
    }
}
