package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class mz0 implements Runnable {
    public final int f47896a;
    public final rz0 f47897b;

    public mz0(rz0 rz0Var, int i7) {
        this.f47896a = i7;
        this.f47897b = rz0Var;
    }

    @Override
    public final void run() {
        switch (this.f47896a) {
            case 0:
                rz0 rz0Var = this.f47897b;
                mz0 mz0Var = rz0Var.Z;
                org.telegram.ui.Components.n51 n51Var = rz0Var.f49585x;
                if (n51Var != null) {
                    rz0Var.f49572a0 = ((float) n51Var.S()) / ((float) rz0Var.f49585x.U());
                    pz0 pz0Var = rz0Var.N;
                    if (pz0Var != null) {
                        pz0Var.f29940nc = (rz0Var.f49585x.U() - rz0Var.f49585x.S()) / 1000;
                        rz0Var.N.R3();
                        org.telegram.ui.Components.pm0 seekBarWaveform = rz0Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = rz0Var.f49572a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f37110n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (rz0Var.f49585x.d0()) {
                        org.telegram.messenger.g0.r(mz0Var);
                        org.telegram.messenger.g0.i3(mz0Var, 16L);
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
                rz0 rz0Var2 = this.f47897b;
                if (rz0Var2.d == null) {
                    org.telegram.messenger.g0.h3(new mz0(rz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = rz0Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        rz0Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
