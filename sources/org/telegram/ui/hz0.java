package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class hz0 implements Runnable {
    public final int f46460a;
    public final SecretMediaViewer f46461b;

    public hz0(SecretMediaViewer secretMediaViewer, int i7) {
        this.f46460a = i7;
        this.f46461b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i7 = this.f46460a;
        SecretMediaViewer secretMediaViewer = this.f46461b;
        switch (i7) {
            case 0:
                secretMediaViewer.I0 = null;
                secretMediaViewer.f41920k0 = 0;
                secretMediaViewer.f41906e.setLayerType(0, null);
                secretMediaViewer.f41906e.setVisibility(4);
                secretMediaViewer.f41935s = false;
                secretMediaViewer.L = null;
                secretMediaViewer.K = false;
                secretMediaViewer.j();
                new ArrayList();
                org.telegram.messenger.g0.i3(new hz0(secretMediaViewer, 4), 50L);
                return;
            case 1:
                bi.x5 x5Var = secretMediaViewer.f41906e;
                if (x5Var != null) {
                    x5Var.setLayerType(0, null);
                    secretMediaViewer.f41906e.setVisibility(4);
                    secretMediaViewer.f41920k0 = 0;
                    secretMediaViewer.f41935s = false;
                    secretMediaViewer.L = null;
                    secretMediaViewer.K = false;
                    secretMediaViewer.j();
                    new ArrayList();
                    org.telegram.messenger.g0.i3(new hz0(secretMediaViewer, 4), 50L);
                    secretMediaViewer.f41906e.setScaleX(1.0f);
                    secretMediaViewer.f41906e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                np0 np0Var = secretMediaViewer.D;
                if (np0Var != null) {
                    long S = np0Var.S();
                    long U = secretMediaViewer.D.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        org.telegram.ui.Components.v51 v51Var = secretMediaViewer.O;
                        if (!v51Var.f38868f) {
                            v51Var.h(false, ((float) S) / ((float) U));
                            secretMediaViewer.P.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f41915h1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f41917i1;
                    Arrays.fill(iArr2, 0);
                    np0 np0Var2 = secretMediaViewer.D;
                    if (np0Var2 != null) {
                        long max = Math.max(0L, np0Var2.S()) / 1000;
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
                    org.telegram.ui.ActionBar.m5 m5Var = secretMediaViewer.Q;
                    Locale locale = Locale.ROOT;
                    m5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.D.d0()) {
                        org.telegram.messenger.g0.i3(secretMediaViewer.f41913g1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.n(false, true);
                return;
            default:
                org.telegram.messenger.jc jcVar = secretMediaViewer.f41912g0;
                if (jcVar != null) {
                    jcVar.a();
                    secretMediaViewer.f41912g0 = null;
                }
                secretMediaViewer.h.w0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f41898b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                secretMediaViewer.f41914h0 = false;
                return;
        }
    }

    public hz0(SecretMediaViewer secretMediaViewer, zq0 zq0Var, int i7) {
        this.f46460a = i7;
        this.f46461b = secretMediaViewer;
    }
}
