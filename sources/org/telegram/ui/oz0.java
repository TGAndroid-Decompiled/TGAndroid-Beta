package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class oz0 implements Runnable {
    public final int f50668a;
    public final tz0 f50669b;

    public oz0(tz0 tz0Var, int i7) {
        this.f50668a = i7;
        this.f50669b = tz0Var;
    }

    @Override
    public final void run() {
        switch (this.f50668a) {
            case 0:
                tz0 tz0Var = this.f50669b;
                oz0 oz0Var = tz0Var.f52384a0;
                org.telegram.ui.Components.i61 i61Var = tz0Var.f52398x;
                if (i61Var != null) {
                    tz0Var.f52386b0 = ((float) i61Var.S()) / ((float) tz0Var.f52398x.U());
                    rz0 rz0Var = tz0Var.O;
                    if (rz0Var != null) {
                        rz0Var.f31529pc = (tz0Var.f52398x.U() - tz0Var.f52398x.S()) / 1000;
                        tz0Var.O.U3();
                        org.telegram.ui.Components.dn0 seekBarWaveform = tz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = tz0Var.f52386b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.f34509n;
                            if (r1Var != null) {
                                r1Var.invalidate();
                            }
                        }
                    }
                    if (tz0Var.f52398x.d0()) {
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
                tz0 tz0Var2 = this.f50669b;
                if (tz0Var2.d == null) {
                    org.telegram.messenger.g0.g3(new oz0(tz0Var2, 2));
                    org.telegram.ui.Cells.r1 r1Var2 = tz0Var2.P;
                    if (r1Var2 != null) {
                        r1Var2.setVisibility(0);
                        tz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
