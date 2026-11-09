package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class pz0 implements Runnable {
    public final int f48835a;
    public final uz0 f48836b;

    public pz0(uz0 uz0Var, int i7) {
        this.f48835a = i7;
        this.f48836b = uz0Var;
    }

    @Override
    public final void run() {
        switch (this.f48835a) {
            case 0:
                uz0 uz0Var = this.f48836b;
                pz0 pz0Var = uz0Var.Z;
                org.telegram.ui.Components.u51 u51Var = uz0Var.f50514x;
                if (u51Var != null) {
                    uz0Var.f50501a0 = ((float) u51Var.S()) / ((float) uz0Var.f50514x.U());
                    sz0 sz0Var = uz0Var.N;
                    if (sz0Var != null) {
                        sz0Var.f29961oc = (uz0Var.f50514x.U() - uz0Var.f50514x.S()) / 1000;
                        uz0Var.N.S3();
                        org.telegram.ui.Components.qm0 seekBarWaveform = uz0Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = uz0Var.f50501a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f37429n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (uz0Var.f50514x.d0()) {
                        org.telegram.messenger.g0.r(pz0Var);
                        org.telegram.messenger.g0.i3(pz0Var, 16L);
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
                uz0 uz0Var2 = this.f48836b;
                if (uz0Var2.d == null) {
                    org.telegram.messenger.g0.h3(new pz0(uz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = uz0Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        uz0Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
