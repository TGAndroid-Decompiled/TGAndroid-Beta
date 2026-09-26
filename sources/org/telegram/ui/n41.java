package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class n41 implements Runnable {
    public final int f35746a;
    public final SecretMediaViewer f35747b;

    public n41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f35746a = i10;
        this.f35747b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f35746a;
        SecretMediaViewer secretMediaViewer = this.f35747b;
        switch (i10) {
            case 0:
                secretMediaViewer.K0 = null;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.f31761s = false;
                secretMediaViewer.N = null;
                secretMediaViewer.M = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new n41(secretMediaViewer, 4), 50L);
                return;
            case 1:
                ci.m6 m6Var = secretMediaViewer.e;
                if (m6Var != null) {
                    m6Var.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.m0 = 0;
                    secretMediaViewer.f31761s = false;
                    secretMediaViewer.N = null;
                    secretMediaViewer.M = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new n41(secretMediaViewer, 4), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                t41 t41Var = secretMediaViewer.f31775y;
                if (t41Var != null) {
                    long n10 = t41Var.n();
                    long p5 = secretMediaViewer.f31775y.p();
                    if (p5 == -9223372036854775807L) {
                        n10 = 0;
                        p5 = 0;
                    }
                    if (p5 > 0) {
                        org.telegram.ui.Components.v71 v71Var = secretMediaViewer.Q;
                        if (!v71Var.f29021f) {
                            v71Var.h(((float) n10) / ((float) p5), false);
                            secretMediaViewer.R.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f31744j1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f31746k1;
                    Arrays.fill(iArr2, 0);
                    t41 t41Var2 = secretMediaViewer.f31775y;
                    if (t41Var2 != null) {
                        long max = Math.max(0L, t41Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f31775y.p()) / 1000;
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
                    org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.S;
                    Locale locale = Locale.ROOT;
                    h5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f31775y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f31742i1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f31741i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f31741i0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f31724b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                secretMediaViewer.f31743j0 = false;
                return;
        }
    }

    public n41(SecretMediaViewer secretMediaViewer, vu0 vu0Var, int i10) {
        this.f35746a = i10;
        this.f35747b = secretMediaViewer;
    }
}
