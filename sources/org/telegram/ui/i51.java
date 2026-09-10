package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class i51 implements Runnable {
    public final int f33538a;
    public final n51 f33539b;

    public i51(n51 n51Var, int i10) {
        this.f33538a = i10;
        this.f33539b = n51Var;
    }

    @Override
    public final void run() {
        switch (this.f33538a) {
            case 0:
                n51 n51Var = this.f33539b;
                i51 i51Var = n51Var.Z;
                org.telegram.ui.Components.t71 t71Var = n51Var.f35132w;
                if (t71Var != null) {
                    n51Var.f35121a0 = ((float) t71Var.n()) / ((float) n51Var.f35132w.p());
                    l51 l51Var = n51Var.N;
                    if (l51Var != null) {
                        l51Var.Xd = (n51Var.f35132w.p() - n51Var.f35132w.n()) / 1000;
                        n51Var.N.q4();
                        org.telegram.ui.Components.ro0 seekBarWaveform = n51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = n51Var.f35121a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f26721n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (n51Var.f35132w.y()) {
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
                n51 n51Var2 = this.f33539b;
                if (n51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new i51(n51Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = n51Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        n51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
