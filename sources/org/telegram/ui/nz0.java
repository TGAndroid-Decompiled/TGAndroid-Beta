package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class nz0 implements Runnable {
    public final int f50459a;
    public final sz0 f50460b;

    public nz0(sz0 sz0Var, int i7) {
        this.f50459a = i7;
        this.f50460b = sz0Var;
    }

    @Override
    public final void run() {
        switch (this.f50459a) {
            case 0:
                sz0 sz0Var = this.f50460b;
                nz0 nz0Var = sz0Var.f52177a0;
                org.telegram.ui.Components.h61 h61Var = sz0Var.f52191x;
                if (h61Var != null) {
                    sz0Var.f52179b0 = ((float) h61Var.S()) / ((float) sz0Var.f52191x.U());
                    qz0 qz0Var = sz0Var.O;
                    if (qz0Var != null) {
                        qz0Var.f31613pc = (sz0Var.f52191x.U() - sz0Var.f52191x.S()) / 1000;
                        sz0Var.O.U3();
                        org.telegram.ui.Components.dn0 seekBarWaveform = sz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = sz0Var.f52179b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.f34406n;
                            if (r1Var != null) {
                                r1Var.invalidate();
                            }
                        }
                    }
                    if (sz0Var.f52191x.d0()) {
                        org.telegram.messenger.g0.r(nz0Var);
                        org.telegram.messenger.g0.h3(nz0Var, 16L);
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
                sz0 sz0Var2 = this.f50460b;
                if (sz0Var2.d == null) {
                    org.telegram.messenger.g0.g3(new nz0(sz0Var2, 2));
                    org.telegram.ui.Cells.r1 r1Var2 = sz0Var2.P;
                    if (r1Var2 != null) {
                        r1Var2.setVisibility(0);
                        sz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
