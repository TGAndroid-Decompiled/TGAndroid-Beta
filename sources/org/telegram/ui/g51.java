package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class g51 implements Runnable {
    public final int f33837a;
    public final l51 f33838b;

    public g51(l51 l51Var, int i10) {
        this.f33837a = i10;
        this.f33838b = l51Var;
    }

    @Override
    public final void run() {
        switch (this.f33837a) {
            case 0:
                l51 l51Var = this.f33838b;
                g51 g51Var = l51Var.Z;
                org.telegram.ui.Components.v71 v71Var = l51Var.f35337w;
                if (v71Var != null) {
                    l51Var.f35326a0 = ((float) v71Var.n()) / ((float) l51Var.f35337w.p());
                    j51 j51Var = l51Var.N;
                    if (j51Var != null) {
                        j51Var.Xd = (l51Var.f35337w.p() - l51Var.f35337w.n()) / 1000;
                        l51Var.N.q4();
                        org.telegram.ui.Components.xo0 seekBarWaveform = l51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = l51Var.f35326a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f30370n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (l51Var.f35337w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(g51Var);
                        AndroidUtilities.runOnUIThread(g51Var, 16L);
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
                l51 l51Var2 = this.f33838b;
                if (l51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new g51(l51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = l51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        l51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
