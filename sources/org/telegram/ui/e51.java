package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class e51 implements Runnable {
    public final int f37246a;
    public final j51 f37247b;

    public e51(j51 j51Var, int i10) {
        this.f37246a = i10;
        this.f37247b = j51Var;
    }

    @Override
    public final void run() {
        switch (this.f37246a) {
            case 0:
                j51 j51Var = this.f37247b;
                e51 e51Var = j51Var.Z;
                org.telegram.ui.Components.l81 l81Var = j51Var.f38888w;
                if (l81Var != null) {
                    j51Var.f38876a0 = ((float) l81Var.n()) / ((float) j51Var.f38888w.p());
                    h51 h51Var = j51Var.N;
                    if (h51Var != null) {
                        h51Var.Xd = (j51Var.f38888w.p() - j51Var.f38888w.n()) / 1000;
                        j51Var.N.q4();
                        org.telegram.ui.Components.op0 seekBarWaveform = j51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = j51Var.f38876a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f29589n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (j51Var.f38888w.y()) {
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
                j51 j51Var2 = this.f37247b;
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
