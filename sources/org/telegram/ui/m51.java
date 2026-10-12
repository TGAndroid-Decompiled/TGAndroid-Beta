package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class m51 implements Runnable {
    public final int f38166a;
    public final r51 f38167b;

    public m51(r51 r51Var, int i10) {
        this.f38166a = i10;
        this.f38167b = r51Var;
    }

    @Override
    public final void run() {
        switch (this.f38166a) {
            case 0:
                r51 r51Var = this.f38167b;
                m51 m51Var = r51Var.Z;
                org.telegram.ui.Components.h81 h81Var = r51Var.f39608w;
                if (h81Var != null) {
                    r51Var.f39597a0 = ((float) h81Var.n()) / ((float) r51Var.f39608w.p());
                    p51 p51Var = r51Var.N;
                    if (p51Var != null) {
                        p51Var.Xd = (r51Var.f39608w.p() - r51Var.f39608w.n()) / 1000;
                        r51Var.N.q4();
                        org.telegram.ui.Components.jp0 seekBarWaveform = r51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = r51Var.f39597a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f26439n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (r51Var.f39608w.y()) {
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
                r51 r51Var2 = this.f38167b;
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
