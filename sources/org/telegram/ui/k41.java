package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class k41 implements Runnable {
    public final int f35567a;
    public final p41 f35568b;

    public k41(p41 p41Var, int i10) {
        this.f35567a = i10;
        this.f35568b = p41Var;
    }

    @Override
    public final void run() {
        switch (this.f35567a) {
            case 0:
                p41 p41Var = this.f35568b;
                k41 k41Var = p41Var.W;
                org.telegram.ui.Components.i71 i71Var = p41Var.f37180w;
                if (i71Var != null) {
                    p41Var.X = ((float) i71Var.n()) / ((float) p41Var.f37180w.p());
                    n41 n41Var = p41Var.K;
                    if (n41Var != null) {
                        n41Var.Ud = (p41Var.f37180w.p() - p41Var.f37180w.n()) / 1000;
                        p41Var.K.q4();
                        org.telegram.ui.Components.mo0 seekBarWaveform = p41Var.K.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = p41Var.X;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f27093n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (p41Var.f37180w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(k41Var);
                        AndroidUtilities.runOnUIThread(k41Var, 16L);
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
                p41 p41Var2 = this.f35568b;
                if (p41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new k41(p41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = p41Var2.L;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        p41Var2.L.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
