package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class y6 implements org.telegram.ui.ActionBar.s0, bl0 {
    public final int f34931a;
    public final g8 f34932b;

    public y6(g8 g8Var, int i10) {
        this.f34931a = i10;
        this.f34932b = g8Var;
    }

    @Override
    public boolean c(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        g8 g8Var = this.f34932b;
        if (z10) {
            if (!g8Var.s0()) {
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                g8Var.B0(xVar, xVar.getMessageObject());
                return true;
            }
            return false;
        }
        g8Var.getClass();
        return false;
    }

    @Override
    public void i(int i10) {
        switch (this.f34931a) {
            case 0:
                g8 g8Var = this.f34932b;
                g8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = g8.Q0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        g8Var.F0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g8 g8Var2 = this.f34932b;
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
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    g8Var2.f28799s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        g8Var2.f28792n.B0();
                        g8Var2.w0(false);
                    }
                }
                g8Var2.H0();
                return;
            default:
                this.f34932b.t0(i10);
                return;
        }
    }
}
