package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class dz0 implements Runnable {
    public final int f44840a;
    public final iz0 f44841b;

    public dz0(iz0 iz0Var, int i3) {
        this.f44840a = i3;
        this.f44841b = iz0Var;
    }

    @Override
    public final void run() {
        switch (this.f44840a) {
            case 0:
                iz0 iz0Var = this.f44841b;
                dz0 dz0Var = iz0Var.f46457a0;
                org.telegram.ui.Components.m51 m51Var = iz0Var.f46471x;
                if (m51Var != null) {
                    iz0Var.f46459b0 = ((float) m51Var.S()) / ((float) iz0Var.f46471x.U());
                    gz0 gz0Var = iz0Var.O;
                    if (gz0Var != null) {
                        gz0Var.f30017nc = (iz0Var.f46471x.U() - iz0Var.f46471x.S()) / 1000;
                        iz0Var.O.Q3();
                        org.telegram.ui.Components.sm0 seekBarWaveform = iz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = iz0Var.f46459b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f38076n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (iz0Var.f46471x.d0()) {
                        org.telegram.messenger.g0.r(dz0Var);
                        org.telegram.messenger.g0.i3(dz0Var, 16L);
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
                iz0 iz0Var2 = this.f44841b;
                if (iz0Var2.d == null) {
                    org.telegram.messenger.g0.h3(new dz0(iz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = iz0Var2.P;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        iz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
