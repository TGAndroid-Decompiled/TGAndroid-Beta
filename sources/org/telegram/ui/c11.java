package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class c11 implements Runnable {
    public final int f36371a;
    public final i11 f36372b;

    public c11(i11 i11Var, int i10) {
        this.f36371a = i10;
        this.f36372b = i11Var;
    }

    @Override
    public final void run() {
        switch (this.f36371a) {
            case 0:
                i11 i11Var = this.f36372b;
                c11 c11Var = i11Var.Z;
                org.telegram.ui.Components.u61 u61Var = i11Var.f38095x;
                if (u61Var != null) {
                    i11Var.f38083a0 = ((float) u61Var.S()) / ((float) i11Var.f38095x.U());
                    g11 g11Var = i11Var.N;
                    if (g11Var != null) {
                        g11Var.f22647mc = (i11Var.f38095x.U() - i11Var.f38095x.S()) / 1000;
                        i11Var.N.O3();
                        org.telegram.ui.Components.qn0 seekBarWaveform = i11Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = i11Var.f38083a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f29698n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (i11Var.f38095x.d0()) {
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
                i11 i11Var2 = this.f36372b;
                if (i11Var2.d == null) {
                    org.telegram.messenger.i0.g3(new c11(i11Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = i11Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        i11Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
