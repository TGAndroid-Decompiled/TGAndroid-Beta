package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class c51 implements Runnable {
    public final int f32674a;
    public final h51 f32675b;

    public c51(h51 h51Var, int i10) {
        this.f32674a = i10;
        this.f32675b = h51Var;
    }

    @Override
    public final void run() {
        switch (this.f32674a) {
            case 0:
                h51 h51Var = this.f32675b;
                c51 c51Var = h51Var.Z;
                org.telegram.ui.Components.g71 g71Var = h51Var.f34171w;
                if (g71Var != null) {
                    h51Var.f34160a0 = ((float) g71Var.n()) / ((float) h51Var.f34171w.p());
                    f51 f51Var = h51Var.N;
                    if (f51Var != null) {
                        f51Var.Xd = (h51Var.f34171w.p() - h51Var.f34171w.n()) / 1000;
                        h51Var.N.q4();
                        org.telegram.ui.Components.io0 seekBarWaveform = h51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = h51Var.f34160a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f25103n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (h51Var.f34171w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(c51Var);
                        AndroidUtilities.runOnUIThread(c51Var, 16L);
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
                h51 h51Var2 = this.f32675b;
                if (h51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new c51(h51Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = h51Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        h51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
