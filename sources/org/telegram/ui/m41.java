package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class m41 implements Runnable {
    public final int f38963a;
    public final r41 f38964b;

    public m41(r41 r41Var, int i10) {
        this.f38963a = i10;
        this.f38964b = r41Var;
    }

    @Override
    public final void run() {
        switch (this.f38963a) {
            case 0:
                r41 r41Var = this.f38964b;
                m41 m41Var = r41Var.W;
                org.telegram.ui.Components.k71 k71Var = r41Var.f40775w;
                if (k71Var != null) {
                    r41Var.X = ((float) k71Var.n()) / ((float) r41Var.f40775w.p());
                    p41 p41Var = r41Var.K;
                    if (p41Var != null) {
                        p41Var.Ud = (r41Var.f40775w.p() - r41Var.f40775w.n()) / 1000;
                        r41Var.K.q4();
                        org.telegram.ui.Components.no0 seekBarWaveform = r41Var.K.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = r41Var.X;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f29594n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (r41Var.f40775w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m41Var);
                        AndroidUtilities.runOnUIThread(m41Var, 16L);
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
                r41 r41Var2 = this.f38964b;
                if (r41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new m41(r41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = r41Var2.L;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        r41Var2.L.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
