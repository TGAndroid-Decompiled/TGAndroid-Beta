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
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.nb0;

public final class b6 implements NotificationCenter.NotificationCenterDelegate {

    public static b6 f22786c;

    public int f22787a;

    public HashMap f22788b;

    public static void a(boolean z10) {
        String str;
        ArrayList arrayList;
        if (f22786c == null || z10) {
            ArrayList arrayList2 = null;
            int i10 = 0;
            while (i10 < 5) {
                if (i10 == 0) {
                    str = "Blue";
                } else if (i10 == 1) {
                    str = "Dark Blue";
                } else if (i10 != 2) {
                    str = i10 != 3 ? "Night" : "Day";
                } else {
                    str = "Arctic Blue";
                }
                f6 f6Var = (f6) g6.H.get(str);
                if (f6Var != null && (arrayList = f6Var.X) != null && !arrayList.isEmpty()) {
                    int size = f6Var.X.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        e6 e6Var = (e6) f6Var.X.get(i11);
                        if (e6Var.f22883a != g6.f23227n && !TextUtils.isEmpty(e6Var.f22895o)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(e6Var);
                        }
                    }
                }
                i10++;
            }
            b6 b6Var = new b6();
            b6Var.f22787a = UserConfig.selectedAccount;
            if (arrayList2 != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(6, b6Var, arrayList2));
            }
            f22786c = b6Var;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z10, File file, e6 e6Var) {
        Bitmap bitmap2;
        int patternColor;
        int i10;
        int i11;
        int i12;
        try {
            File fileD = e6Var.d();
            Drawable colorDrawable = null;
            if (fileD == null) {
                return null;
            }
            f6 f6Var = e6Var.f22884b;
            SparseIntArray sparseIntArrayQ0 = g6.Q0(null, f6Var.d, null);
            g6.G(sparseIntArrayQ0, f6Var);
            int i13 = e6Var.f22885c;
            int iB = (int) e6Var.f22890j;
            long j10 = e6Var.f22891k;
            int iB2 = (int) j10;
            if (iB2 == 0 && j10 == 0) {
                if (iB != 0) {
                    i13 = iB;
                }
                int i14 = sparseIntArrayQ0.get(g6.Od);
                if (i14 != 0) {
                    iB2 = g6.B(f6Var, i13, i14);
                }
            } else {
                i13 = 0;
            }
            long j11 = e6Var.f22892l;
            int iB3 = (int) j11;
            if (iB3 == 0 && j11 == 0 && (i12 = sparseIntArrayQ0.get(g6.Pd)) != 0) {
                iB3 = g6.B(f6Var, i13, i12);
            }
            long j12 = e6Var.f22893m;
            int iB4 = (int) j12;
            if (iB4 == 0 && j12 == 0 && (i11 = sparseIntArrayQ0.get(g6.Qd)) != 0) {
                iB4 = g6.B(f6Var, i13, i11);
            }
            if (iB == 0 && (i10 = sparseIntArrayQ0.get(g6.Nd)) != 0) {
                iB = g6.B(f6Var, i13, i10);
            }
            if (iB3 != 0) {
                patternColor = nb0.g(iB, iB2, iB3, iB4);
            } else if (iB2 != 0) {
                Drawable m9Var = new m9(m9.d(e6Var.f22894n), new int[]{iB, iB2});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(iB, iB2));
                colorDrawable = m9Var;
            } else {
                colorDrawable = new ColorDrawable(iB);
                patternColor = AndroidUtilities.getPatternColor(iB);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int iMin = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                bitmap2 = z10 ? SvgHelper.getBitmap(file, iMin, Math.max(point2.x, point2.y), false, SvgHelper.ScaleMode.ByWidth) : g6.i1(new FileInputStream(file), 0);
            } else {
                bitmap2 = bitmap;
            }
            try {
                if (colorDrawable == null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileD);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return bitmap2;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                colorDrawable.setBounds(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                colorDrawable.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) (Math.abs(e6Var.f22896p) * 255.0f));
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(fileD));
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        HashMap map = this.f22788b;
        if (map == null) {
            return;
        }
        boolean z10 = false;
        if (i10 == NotificationCenter.fileLoaded) {
            a6 a6Var = (a6) map.remove((String) objArr[0]);
            if (a6Var != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(7, this, a6Var));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileLoadFailed || map.remove((String) objArr[0]) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new hh.t5(this, (Object) null, z10, 8));
    }
}
