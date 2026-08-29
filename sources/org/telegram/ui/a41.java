package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class a41 implements Runnable {
    public final int f36423a;
    public final f41 f36424b;

    public a41(f41 f41Var, int i10) {
        this.f36423a = i10;
        this.f36424b = f41Var;
    }

    @Override
    public final void run() {
        switch (this.f36423a) {
            case 0:
                f41 f41Var = this.f36424b;
                a41 a41Var = f41Var.V;
                org.telegram.ui.Components.x61 x61Var = f41Var.f37996w;
                if (x61Var != null) {
                    f41Var.W = ((float) x61Var.o()) / ((float) f41Var.f37996w.q());
                    d41 d41Var = f41Var.J;
                    if (d41Var != null) {
                        d41Var.Td = (f41Var.f37996w.q() - f41Var.f37996w.o()) / 1000;
                        f41Var.J.q4();
                        org.telegram.ui.Components.co0 seekBarWaveform = f41Var.J.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f9 = f41Var.W;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f9;
                            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.f27534n;
                            if (s1Var != null) {
                                s1Var.invalidate();
                            }
                        }
                    }
                    if (f41Var.f37996w.z()) {
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
                f41 f41Var2 = this.f36424b;
                if (f41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new a41(f41Var2, 2));
                    org.telegram.ui.Cells.s1 s1Var2 = f41Var2.K;
                    if (s1Var2 != null) {
                        s1Var2.setVisibility(0);
                        f41Var2.K.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
