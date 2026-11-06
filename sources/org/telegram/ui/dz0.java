package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class dz0 implements Runnable {
    public final int f45135a;
    public final SecretMediaViewer f45136b;

    public dz0(SecretMediaViewer secretMediaViewer, int i7) {
        this.f45135a = i7;
        this.f45136b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i7 = this.f45135a;
        SecretMediaViewer secretMediaViewer = this.f45136b;
        switch (i7) {
            case 0:
                secretMediaViewer.I0 = null;
                secretMediaViewer.f41894k0 = 0;
                secretMediaViewer.f41880e.setLayerType(0, null);
                secretMediaViewer.f41880e.setVisibility(4);
                secretMediaViewer.f41909s = false;
                secretMediaViewer.L = null;
                secretMediaViewer.K = false;
                secretMediaViewer.j();
                new ArrayList();
                org.telegram.messenger.g0.i3(new dz0(secretMediaViewer, 4), 50L);
                return;
            case 1:
                bi.x5 x5Var = secretMediaViewer.f41880e;
                if (x5Var != null) {
                    x5Var.setLayerType(0, null);
                    secretMediaViewer.f41880e.setVisibility(4);
                    secretMediaViewer.f41894k0 = 0;
                    secretMediaViewer.f41909s = false;
                    secretMediaViewer.L = null;
                    secretMediaViewer.K = false;
                    secretMediaViewer.j();
                    new ArrayList();
                    org.telegram.messenger.g0.i3(new dz0(secretMediaViewer, 4), 50L);
                    secretMediaViewer.f41880e.setScaleX(1.0f);
                    secretMediaViewer.f41880e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                jp0 jp0Var = secretMediaViewer.D;
                if (jp0Var != null) {
                    long S = jp0Var.S();
                    long U = secretMediaViewer.D.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        org.telegram.ui.Components.q51 q51Var = secretMediaViewer.O;
                        if (!q51Var.f37255f) {
                            q51Var.h(false, ((float) S) / ((float) U));
                            secretMediaViewer.P.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f41889h1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f41891i1;
                    Arrays.fill(iArr2, 0);
                    jp0 jp0Var2 = secretMediaViewer.D;
                    if (jp0Var2 != null) {
                        long max = Math.max(0L, jp0Var2.S()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.D.U()) / 1000;
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
                    org.telegram.ui.ActionBar.k5 k5Var = secretMediaViewer.Q;
                    Locale locale = Locale.ROOT;
                    k5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.D.d0()) {
                        org.telegram.messenger.g0.i3(secretMediaViewer.f41887g1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.n(false, true);
                return;
            default:
                org.telegram.messenger.jc jcVar = secretMediaViewer.f41886g0;
                if (jcVar != null) {
                    jcVar.a();
                    secretMediaViewer.f41886g0 = null;
                }
                secretMediaViewer.h.w0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f41872b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                secretMediaViewer.f41888h0 = false;
                return;
        }
    }

    public dz0(SecretMediaViewer secretMediaViewer, vq0 vq0Var, int i7) {
        this.f45135a = i7;
        this.f45136b = secretMediaViewer;
    }
}
