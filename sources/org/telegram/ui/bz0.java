package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class bz0 implements Runnable {
    public final int f45864a;
    public final SecretMediaViewer f45865b;

    public bz0(SecretMediaViewer secretMediaViewer, int i7) {
        this.f45864a = i7;
        this.f45865b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i7 = this.f45864a;
        SecretMediaViewer secretMediaViewer = this.f45865b;
        switch (i7) {
            case 0:
                secretMediaViewer.J0 = null;
                secretMediaViewer.f43295l0 = 0;
                secretMediaViewer.f43279e.setLayerType(0, null);
                secretMediaViewer.f43279e.setVisibility(4);
                secretMediaViewer.f43308s = false;
                secretMediaViewer.M = null;
                secretMediaViewer.L = false;
                secretMediaViewer.j();
                new ArrayList();
                org.telegram.messenger.g0.i3(new bz0(secretMediaViewer, 4), 50L);
                return;
            case 1:
                ai.j0 j0Var = secretMediaViewer.f43279e;
                if (j0Var != null) {
                    j0Var.setLayerType(0, null);
                    secretMediaViewer.f43279e.setVisibility(4);
                    secretMediaViewer.f43295l0 = 0;
                    secretMediaViewer.f43308s = false;
                    secretMediaViewer.M = null;
                    secretMediaViewer.L = false;
                    secretMediaViewer.j();
                    new ArrayList();
                    org.telegram.messenger.g0.i3(new bz0(secretMediaViewer, 4), 50L);
                    secretMediaViewer.f43279e.setScaleX(1.0f);
                    secretMediaViewer.f43279e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                ip0 ip0Var = secretMediaViewer.E;
                if (ip0Var != null) {
                    long S = ip0Var.S();
                    long U = secretMediaViewer.E.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        org.telegram.ui.Components.w51 w51Var = secretMediaViewer.P;
                        if (!w51Var.f41271f) {
                            w51Var.h(false, ((float) S) / ((float) U));
                            secretMediaViewer.Q.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f43290i1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f43292j1;
                    Arrays.fill(iArr2, 0);
                    ip0 ip0Var2 = secretMediaViewer.E;
                    if (ip0Var2 != null) {
                        long max = Math.max(0L, ip0Var2.S()) / 1000;
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
                    org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.R;
                    Locale locale = Locale.ROOT;
                    j5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.E.d0()) {
                        org.telegram.messenger.g0.i3(secretMediaViewer.f43288h1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.n(false, true);
                return;
            default:
                org.telegram.messenger.ic icVar = secretMediaViewer.f43287h0;
                if (icVar != null) {
                    icVar.a();
                    secretMediaViewer.f43287h0 = null;
                }
                secretMediaViewer.h.w0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f43271b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                secretMediaViewer.f43289i0 = false;
                return;
        }
    }

    public bz0(SecretMediaViewer secretMediaViewer, uq0 uq0Var, int i7) {
        this.f45864a = i7;
        this.f45865b = secretMediaViewer;
    }
}
