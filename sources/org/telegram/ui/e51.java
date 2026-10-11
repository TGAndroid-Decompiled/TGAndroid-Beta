package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class e51 implements Runnable {
    public final int f37212a;
    public final j51 f37213b;

    public e51(j51 j51Var, int i10) {
        this.f37212a = i10;
        this.f37213b = j51Var;
    }

    @Override
    public final void run() {
        switch (this.f37212a) {
            case 0:
                j51 j51Var = this.f37213b;
                e51 e51Var = j51Var.Z;
                org.telegram.ui.Components.m81 m81Var = j51Var.f38854w;
                if (m81Var != null) {
                    j51Var.f38842a0 = ((float) m81Var.n()) / ((float) j51Var.f38854w.p());
                    h51 h51Var = j51Var.N;
                    if (h51Var != null) {
                        h51Var.Xd = (j51Var.f38854w.p() - j51Var.f38854w.n()) / 1000;
                        j51Var.N.q4();
                        org.telegram.ui.Components.pp0 seekBarWaveform = j51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = j51Var.f38842a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f29805n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (j51Var.f38854w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(e51Var);
                        AndroidUtilities.runOnUIThread(e51Var, 16L);
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
                j51 j51Var2 = this.f37213b;
                if (j51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new e51(j51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = j51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        j51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
