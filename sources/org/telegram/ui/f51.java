package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class f51 implements Runnable {
    public final int f37497a;
    public final k51 f37498b;

    public f51(k51 k51Var, int i10) {
        this.f37497a = i10;
        this.f37498b = k51Var;
    }

    @Override
    public final void run() {
        switch (this.f37497a) {
            case 0:
                k51 k51Var = this.f37498b;
                f51 f51Var = k51Var.Z;
                org.telegram.ui.Components.l81 l81Var = k51Var.f39144w;
                if (l81Var != null) {
                    k51Var.f39132a0 = ((float) l81Var.n()) / ((float) k51Var.f39144w.p());
                    i51 i51Var = k51Var.N;
                    if (i51Var != null) {
                        i51Var.Xd = (k51Var.f39144w.p() - k51Var.f39144w.n()) / 1000;
                        k51Var.N.q4();
                        org.telegram.ui.Components.op0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = k51Var.f39132a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f29557n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (k51Var.f39144w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(f51Var);
                        AndroidUtilities.runOnUIThread(f51Var, 16L);
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
                k51 k51Var2 = this.f37498b;
                if (k51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new f51(k51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = k51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        k51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
