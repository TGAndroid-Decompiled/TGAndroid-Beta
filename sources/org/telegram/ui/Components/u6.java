package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class u6 implements org.telegram.ui.ActionBar.s0, kl0 {
    public final int f29111a;
    public final c8 f29112b;

    public u6(c8 c8Var, int i10) {
        this.f29111a = i10;
        this.f29112b = c8Var;
    }

    @Override
    public boolean f(int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.x;
        c8 c8Var = this.f29112b;
        if (z4) {
            if (!c8Var.s0()) {
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                c8Var.B0(xVar, xVar.getMessageObject());
                return true;
            }
            return false;
        }
        c8Var.getClass();
        return false;
    }

    @Override
    public void l(int i10) {
        switch (this.f29111a) {
            case 0:
                c8 c8Var = this.f29112b;
                c8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = c8.R0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        c8Var.F0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c8 c8Var2 = this.f29112b;
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 4) {
                        if (SharedConfig.repeatMode == 1) {
                            SharedConfig.setRepeatMode(0);
                        } else {
                            SharedConfig.setRepeatMode(1);
                        }
                    } else if (SharedConfig.repeatMode == 2) {
                        SharedConfig.setRepeatMode(0);
                    } else {
                        SharedConfig.setRepeatMode(2);
                    }
                } else {
                    boolean z4 = SharedConfig.playOrderReversed;
                    if ((z4 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    c8Var2.f23907s.l();
                    if (z4 != SharedConfig.playOrderReversed) {
                        c8Var2.f23900n.B0();
                        c8Var2.w0(false);
                    }
                }
                c8Var2.H0();
                return;
            default:
                this.f29112b.t0(i10);
                return;
        }
    }
}
