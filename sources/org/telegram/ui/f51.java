package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class f51 implements Runnable {
    public final int f36296a;
    public final k51 f36297b;

    public f51(k51 k51Var, int i10) {
        this.f36296a = i10;
        this.f36297b = k51Var;
    }

    @Override
    public final void run() {
        switch (this.f36296a) {
            case 0:
                k51 k51Var = this.f36297b;
                f51 f51Var = k51Var.Z;
                org.telegram.ui.Components.g71 g71Var = k51Var.f37958w;
                if (g71Var != null) {
                    k51Var.f37946a0 = ((float) g71Var.n()) / ((float) k51Var.f37958w.p());
                    i51 i51Var = k51Var.N;
                    if (i51Var != null) {
                        i51Var.Xd = (k51Var.f37958w.p() - k51Var.f37958w.n()) / 1000;
                        k51Var.N.q4();
                        org.telegram.ui.Components.io0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = k51Var.f37946a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f27247n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (k51Var.f37958w.y()) {
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
                k51 k51Var2 = this.f36297b;
                if (k51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new f51(k51Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = k51Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        k51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
