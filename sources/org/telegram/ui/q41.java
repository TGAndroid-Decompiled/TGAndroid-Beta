package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class q41 implements Runnable {
    public final int f36615a;
    public final SecretMediaViewer f36616b;

    public q41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f36615a = i10;
        this.f36616b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f36615a;
        SecretMediaViewer secretMediaViewer = this.f36616b;
        switch (i10) {
            case 0:
                secretMediaViewer.K0 = null;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.f31764s = false;
                secretMediaViewer.N = null;
                secretMediaViewer.M = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new q41(secretMediaViewer, 4), 50L);
                return;
            case 1:
                ci.m6 m6Var = secretMediaViewer.e;
                if (m6Var != null) {
                    m6Var.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.m0 = 0;
                    secretMediaViewer.f31764s = false;
                    secretMediaViewer.N = null;
                    secretMediaViewer.M = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new q41(secretMediaViewer, 4), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                w41 w41Var = secretMediaViewer.f31778y;
                if (w41Var != null) {
                    long n10 = w41Var.n();
                    long p5 = secretMediaViewer.f31778y.p();
                    if (p5 == -9223372036854775807L) {
                        n10 = 0;
                        p5 = 0;
                    }
                    if (p5 > 0) {
                        org.telegram.ui.Components.w71 w71Var = secretMediaViewer.Q;
                        if (!w71Var.f29868f) {
                            w71Var.h(((float) n10) / ((float) p5), false);
                            secretMediaViewer.R.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f31747j1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f31749k1;
                    Arrays.fill(iArr2, 0);
                    w41 w41Var2 = secretMediaViewer.f31778y;
                    if (w41Var2 != null) {
                        long max = Math.max(0L, w41Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f31778y.p()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i11 = iArr[0];
                    if (i11 >= 60) {
                        format = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1]));
                    } else {
                        format = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(iArr[1]));
                    }
                    int i12 = iArr2[0];
                    if (i12 >= 60) {
                        format2 = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1]));
                    } else {
                        format2 = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr2[1]));
                    }
                    org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.S;
                    Locale locale = Locale.ROOT;
                    j5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f31778y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f31745i1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f31744i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f31744i0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f31727b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                secretMediaViewer.f31746j0 = false;
                return;
        }
    }

    public q41(SecretMediaViewer secretMediaViewer, yu0 yu0Var, int i10) {
        this.f36615a = i10;
        this.f36616b = secretMediaViewer;
    }
}
