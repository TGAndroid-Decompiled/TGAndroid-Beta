package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class d51 implements Runnable {
    public final int f32873a;
    public final i51 f32874b;

    public d51(i51 i51Var, int i10) {
        this.f32873a = i10;
        this.f32874b = i51Var;
    }

    @Override
    public final void run() {
        switch (this.f32873a) {
            case 0:
                i51 i51Var = this.f32874b;
                d51 d51Var = i51Var.Z;
                org.telegram.ui.Components.u71 u71Var = i51Var.f34325w;
                if (u71Var != null) {
                    i51Var.f34314a0 = ((float) u71Var.n()) / ((float) i51Var.f34325w.p());
                    g51 g51Var = i51Var.N;
                    if (g51Var != null) {
                        g51Var.Xd = (i51Var.f34325w.p() - i51Var.f34325w.n()) / 1000;
                        i51Var.N.q4();
                        org.telegram.ui.Components.wo0 seekBarWaveform = i51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = i51Var.f34314a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f30133n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (i51Var.f34325w.y()) {
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
                i51 i51Var2 = this.f32874b;
                if (i51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new d51(i51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = i51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        i51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
