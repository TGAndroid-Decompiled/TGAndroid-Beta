package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class i51 implements Runnable {
    public final int f38675a;
    public final n51 f38676b;

    public i51(n51 n51Var, int i10) {
        this.f38675a = i10;
        this.f38676b = n51Var;
    }

    @Override
    public final void run() {
        switch (this.f38675a) {
            case 0:
                n51 n51Var = this.f38676b;
                i51 i51Var = n51Var.Z;
                org.telegram.ui.Components.q81 q81Var = n51Var.f40232w;
                if (q81Var != null) {
                    n51Var.f40220a0 = ((float) q81Var.n()) / ((float) n51Var.f40232w.p());
                    l51 l51Var = n51Var.N;
                    if (l51Var != null) {
                        l51Var.Xd = (n51Var.f40232w.p() - n51Var.f40232w.n()) / 1000;
                        n51Var.N.q4();
                        org.telegram.ui.Components.tp0 seekBarWaveform = n51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = n51Var.f40220a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f30934n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (n51Var.f40232w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i51Var);
                        AndroidUtilities.runOnUIThread(i51Var, 16L);
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
                n51 n51Var2 = this.f38676b;
                if (n51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new i51(n51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = n51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        n51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
