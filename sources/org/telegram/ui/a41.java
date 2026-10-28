package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class a41 implements Runnable {
    public final int f37685a;
    public final f41 f37686b;

    public a41(f41 f41Var, int i10) {
        this.f37685a = i10;
        this.f37686b = f41Var;
    }

    @Override
    public final void run() {
        switch (this.f37685a) {
            case 0:
                f41 f41Var = this.f37686b;
                a41 a41Var = f41Var.Z;
                org.telegram.ui.Components.t81 t81Var = f41Var.f39163w;
                if (t81Var != null) {
                    f41Var.f39152a0 = ((float) t81Var.n()) / ((float) f41Var.f39163w.p());
                    d41 d41Var = f41Var.N;
                    if (d41Var != null) {
                        d41Var.Yd = (f41Var.f39163w.p() - f41Var.f39163w.n()) / 1000;
                        f41Var.N.s4();
                        org.telegram.ui.Components.qp0 seekBarWaveform = f41Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = f41Var.f39152a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.f31990n;
                            if (s1Var != null) {
                                s1Var.invalidate();
                            }
                        }
                    }
                    if (f41Var.f39163w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(a41Var);
                        AndroidUtilities.runOnUIThread(a41Var, 16L);
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
                f41 f41Var2 = this.f37686b;
                if (f41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new a41(f41Var2, 2));
                    org.telegram.ui.Cells.s1 s1Var2 = f41Var2.O;
                    if (s1Var2 != null) {
                        s1Var2.setVisibility(0);
                        f41Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
