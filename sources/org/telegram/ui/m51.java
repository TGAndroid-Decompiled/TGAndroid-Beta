package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class m51 implements Runnable {
    public final int f37912a;
    public final r51 f37913b;

    public m51(r51 r51Var, int i10) {
        this.f37912a = i10;
        this.f37913b = r51Var;
    }

    @Override
    public final void run() {
        switch (this.f37912a) {
            case 0:
                r51 r51Var = this.f37913b;
                m51 m51Var = r51Var.Z;
                org.telegram.ui.Components.i81 i81Var = r51Var.f39301w;
                if (i81Var != null) {
                    r51Var.f39290a0 = ((float) i81Var.n()) / ((float) r51Var.f39301w.p());
                    p51 p51Var = r51Var.N;
                    if (p51Var != null) {
                        p51Var.Xd = (r51Var.f39301w.p() - r51Var.f39301w.n()) / 1000;
                        r51Var.N.q4();
                        org.telegram.ui.Components.jp0 seekBarWaveform = r51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = r51Var.f39290a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f26108n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (r51Var.f39301w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m51Var);
                        AndroidUtilities.runOnUIThread(m51Var, 16L);
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
                r51 r51Var2 = this.f37913b;
                if (r51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new m51(r51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = r51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        r51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
