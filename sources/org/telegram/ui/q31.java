package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class q31 implements Runnable {
    public final int f41524a;
    public final SecretMediaViewer f41525b;

    public q31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f41524a = i10;
        this.f41525b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f41524a;
        SecretMediaViewer secretMediaViewer = this.f41525b;
        switch (i10) {
            case 0:
                secretMediaViewer.G0 = null;
                secretMediaViewer.f36202i0 = 0;
                secretMediaViewer.f36192e.setLayerType(0, null);
                secretMediaViewer.f36192e.setVisibility(4);
                secretMediaViewer.f36222s = false;
                secretMediaViewer.J = null;
                secretMediaViewer.I = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new q31(secretMediaViewer, 4), 50L);
                return;
            case 1:
                bg.d1 d1Var = secretMediaViewer.f36192e;
                if (d1Var != null) {
                    d1Var.setLayerType(0, null);
                    secretMediaViewer.f36192e.setVisibility(4);
                    secretMediaViewer.f36202i0 = 0;
                    secretMediaViewer.f36222s = false;
                    secretMediaViewer.J = null;
                    secretMediaViewer.I = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new q31(secretMediaViewer, 4), 50L);
                    secretMediaViewer.f36192e.setScaleX(1.0f);
                    secretMediaViewer.f36192e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                x31 x31Var = secretMediaViewer.f36232y;
                if (x31Var != null) {
                    long o10 = x31Var.o();
                    long q6 = secretMediaViewer.f36232y.q();
                    if (q6 == -9223372036854775807L) {
                        o10 = 0;
                        q6 = 0;
                    }
                    if (q6 > 0) {
                        org.telegram.ui.Components.z61 z61Var = secretMediaViewer.M;
                        if (!z61Var.f35233f) {
                            z61Var.h(((float) o10) / ((float) q6), false);
                            secretMediaViewer.N.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f36197f1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f36199g1;
                    Arrays.fill(iArr2, 0);
                    x31 x31Var2 = secretMediaViewer.f36232y;
                    if (x31Var2 != null) {
                        long max = Math.max(0L, x31Var2.o()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f36232y.q()) / 1000;
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
                    org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.O;
                    Locale locale = Locale.ROOT;
                    h5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f36232y.z()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f36194e1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f36193e0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f36193e0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f36184b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                secretMediaViewer.f36196f0 = false;
                return;
        }
    }

    public q31(SecretMediaViewer secretMediaViewer, zt0 zt0Var, int i10) {
        this.f41524a = i10;
        this.f41525b = secretMediaViewer;
    }
}
