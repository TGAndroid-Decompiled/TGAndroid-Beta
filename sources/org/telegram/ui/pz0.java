package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class pz0 implements Runnable {
    public final int f51016a;
    public final uz0 f51017b;

    public pz0(uz0 uz0Var, int i7) {
        this.f51016a = i7;
        this.f51017b = uz0Var;
    }

    @Override
    public final void run() {
        switch (this.f51016a) {
            case 0:
                uz0 uz0Var = this.f51017b;
                pz0 pz0Var = uz0Var.f52658a0;
                org.telegram.ui.Components.i61 i61Var = uz0Var.f52672x;
                if (i61Var != null) {
                    uz0Var.f52660b0 = ((float) i61Var.S()) / ((float) uz0Var.f52672x.U());
                    sz0 sz0Var = uz0Var.O;
                    if (sz0Var != null) {
                        sz0Var.f31563pc = (uz0Var.f52672x.U() - uz0Var.f52672x.S()) / 1000;
                        uz0Var.O.U3();
                        org.telegram.ui.Components.en0 seekBarWaveform = uz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = uz0Var.f52660b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.f34927n;
                            if (r1Var != null) {
                                r1Var.invalidate();
                            }
                        }
                    }
                    if (uz0Var.f52672x.d0()) {
                        org.telegram.messenger.g0.r(pz0Var);
                        org.telegram.messenger.g0.h3(pz0Var, 16L);
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
                uz0 uz0Var2 = this.f51017b;
                if (uz0Var2.d == null) {
                    org.telegram.messenger.g0.g3(new pz0(uz0Var2, 2));
                    org.telegram.ui.Cells.r1 r1Var2 = uz0Var2.P;
                    if (r1Var2 != null) {
                        r1Var2.setVisibility(0);
                        uz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
