package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class oz0 implements Runnable {
    public final int f50694a;
    public final tz0 f50695b;

    public oz0(tz0 tz0Var, int i7) {
        this.f50694a = i7;
        this.f50695b = tz0Var;
    }

    @Override
    public final void run() {
        switch (this.f50694a) {
            case 0:
                tz0 tz0Var = this.f50695b;
                oz0 oz0Var = tz0Var.f52383a0;
                org.telegram.ui.Components.f61 f61Var = tz0Var.f52397x;
                if (f61Var != null) {
                    tz0Var.f52385b0 = ((float) f61Var.S()) / ((float) tz0Var.f52397x.U());
                    rz0 rz0Var = tz0Var.O;
                    if (rz0Var != null) {
                        rz0Var.f31482pc = (tz0Var.f52397x.U() - tz0Var.f52397x.S()) / 1000;
                        tz0Var.O.U3();
                        org.telegram.ui.Components.bn0 seekBarWaveform = tz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = tz0Var.f52385b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f33737n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (tz0Var.f52397x.d0()) {
                        org.telegram.messenger.g0.r(oz0Var);
                        org.telegram.messenger.g0.h3(oz0Var, 16L);
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
                tz0 tz0Var2 = this.f50695b;
                if (tz0Var2.d == null) {
                    org.telegram.messenger.g0.g3(new oz0(tz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = tz0Var2.P;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        tz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
