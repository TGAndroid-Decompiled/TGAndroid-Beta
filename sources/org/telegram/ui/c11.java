package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class c11 implements Runnable {
    public final int f36160a;
    public final h11 f36161b;

    public c11(h11 h11Var, int i10) {
        this.f36160a = i10;
        this.f36161b = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f36160a) {
            case 0:
                h11 h11Var = this.f36161b;
                c11 c11Var = h11Var.Z;
                org.telegram.ui.Components.v61 v61Var = h11Var.f37628x;
                if (v61Var != null) {
                    h11Var.f37616a0 = ((float) v61Var.S()) / ((float) h11Var.f37628x.U());
                    f11 f11Var = h11Var.N;
                    if (f11Var != null) {
                        f11Var.f22648mc = (h11Var.f37628x.U() - h11Var.f37628x.S()) / 1000;
                        h11Var.N.O3();
                        org.telegram.ui.Components.rn0 seekBarWaveform = h11Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = h11Var.f37616a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f30037n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (h11Var.f37628x.d0()) {
                        org.telegram.messenger.i0.r(c11Var);
                        org.telegram.messenger.i0.h3(c11Var, 16L);
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
                h11 h11Var2 = this.f36161b;
                if (h11Var2.d == null) {
                    org.telegram.messenger.i0.g3(new c11(h11Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = h11Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        h11Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
