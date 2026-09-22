package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class d51 implements Runnable {
    public final int f32941a;
    public final i51 f32942b;

    public d51(i51 i51Var, int i10) {
        this.f32941a = i10;
        this.f32942b = i51Var;
    }

    @Override
    public final void run() {
        switch (this.f32941a) {
            case 0:
                i51 i51Var = this.f32942b;
                d51 d51Var = i51Var.Z;
                org.telegram.ui.Components.g71 g71Var = i51Var.f34424w;
                if (g71Var != null) {
                    i51Var.f34413a0 = ((float) g71Var.n()) / ((float) i51Var.f34424w.p());
                    g51 g51Var = i51Var.N;
                    if (g51Var != null) {
                        g51Var.Xd = (i51Var.f34424w.p() - i51Var.f34424w.n()) / 1000;
                        i51Var.N.q4();
                        org.telegram.ui.Components.io0 seekBarWaveform = i51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = i51Var.f34413a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f25100n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (i51Var.f34424w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(d51Var);
                        AndroidUtilities.runOnUIThread(d51Var, 16L);
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
                i51 i51Var2 = this.f32942b;
                if (i51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new d51(i51Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = i51Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        i51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
