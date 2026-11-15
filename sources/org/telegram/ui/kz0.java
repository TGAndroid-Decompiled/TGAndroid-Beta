package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class kz0 implements Runnable {
    public final int f48798a;
    public final pz0 f48799b;

    public kz0(pz0 pz0Var, int i7) {
        this.f48798a = i7;
        this.f48799b = pz0Var;
    }

    @Override
    public final void run() {
        switch (this.f48798a) {
            case 0:
                pz0 pz0Var = this.f48799b;
                kz0 kz0Var = pz0Var.f50391a0;
                org.telegram.ui.Components.u51 u51Var = pz0Var.f50405x;
                if (u51Var != null) {
                    pz0Var.f50393b0 = ((float) u51Var.S()) / ((float) pz0Var.f50405x.U());
                    nz0 nz0Var = pz0Var.O;
                    if (nz0Var != null) {
                        nz0Var.f31110pc = (pz0Var.f50405x.U() - pz0Var.f50405x.S()) / 1000;
                        pz0Var.O.T3();
                        org.telegram.ui.Components.tm0 seekBarWaveform = pz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = pz0Var.f50393b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f39733n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (pz0Var.f50405x.d0()) {
                        org.telegram.messenger.g0.r(kz0Var);
                        org.telegram.messenger.g0.i3(kz0Var, 16L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                pz0 pz0Var2 = this.f48799b;
                if (pz0Var2.d == null) {
                    org.telegram.messenger.g0.h3(new kz0(pz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = pz0Var2.P;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        pz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
