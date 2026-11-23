package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class ez0 implements Runnable {
    public final int f47648a;
    public final SecretMediaViewer f47649b;

    public ez0(SecretMediaViewer secretMediaViewer, int i7) {
        this.f47648a = i7;
        this.f47649b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i7 = this.f47648a;
        SecretMediaViewer secretMediaViewer = this.f47649b;
        switch (i7) {
            case 0:
                secretMediaViewer.J0 = null;
                secretMediaViewer.f43867l0 = 0;
                secretMediaViewer.f43851e.setLayerType(0, null);
                secretMediaViewer.f43851e.setVisibility(4);
                secretMediaViewer.f43880s = false;
                secretMediaViewer.M = null;
                secretMediaViewer.L = false;
                secretMediaViewer.j();
                new ArrayList();
                org.telegram.messenger.g0.h3(new ez0(secretMediaViewer, 4), 50L);
                return;
            case 1:
                ai.h0 h0Var = secretMediaViewer.f43851e;
                if (h0Var != null) {
                    h0Var.setLayerType(0, null);
                    secretMediaViewer.f43851e.setVisibility(4);
                    secretMediaViewer.f43867l0 = 0;
                    secretMediaViewer.f43880s = false;
                    secretMediaViewer.M = null;
                    secretMediaViewer.L = false;
                    secretMediaViewer.j();
                    new ArrayList();
                    org.telegram.messenger.g0.h3(new ez0(secretMediaViewer, 4), 50L);
                    secretMediaViewer.f43851e.setScaleX(1.0f);
                    secretMediaViewer.f43851e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                kp0 kp0Var = secretMediaViewer.E;
                if (kp0Var != null) {
                    long S = kp0Var.S();
                    long U = secretMediaViewer.E.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        org.telegram.ui.Components.l61 l61Var = secretMediaViewer.P;
                        if (!l61Var.f37053f) {
                            l61Var.h(false, ((float) S) / ((float) U));
                            secretMediaViewer.Q.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f43862i1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f43864j1;
                    Arrays.fill(iArr2, 0);
                    kp0 kp0Var2 = secretMediaViewer.E;
                    if (kp0Var2 != null) {
                        long max = Math.max(0L, kp0Var2.S()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.E.U()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i10 = iArr[0];
                    if (i10 >= 60) {
                        format = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i10 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1]));
                    } else {
                        format = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(iArr[1]));
                    }
                    int i11 = iArr2[0];
                    if (i11 >= 60) {
                        format2 = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1]));
                    } else {
                        format2 = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(iArr2[1]));
                    }
                    org.telegram.ui.ActionBar.n5 n5Var = secretMediaViewer.R;
                    Locale locale = Locale.ROOT;
                    n5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.E.d0()) {
                        org.telegram.messenger.g0.h3(secretMediaViewer.f43860h1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.n(false, true);
                return;
            default:
                org.telegram.messenger.hc hcVar = secretMediaViewer.f43859h0;
                if (hcVar != null) {
                    hcVar.a();
                    secretMediaViewer.f43859h0 = null;
                }
                secretMediaViewer.h.x0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f43843b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                secretMediaViewer.f43861i0 = false;
                return;
        }
    }

    public ez0(SecretMediaViewer secretMediaViewer, wq0 wq0Var, int i7) {
        this.f47648a = i7;
        this.f47649b = secretMediaViewer;
    }
}
