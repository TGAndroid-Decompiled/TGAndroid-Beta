package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class u6 implements org.telegram.ui.ActionBar.s0, ll0 {
    public final int f31555a;
    public final c8 f31556b;

    public u6(c8 c8Var, int i10) {
        this.f31555a = i10;
        this.f31556b = c8Var;
    }

    @Override
    public boolean f(int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.x;
        c8 c8Var = this.f31556b;
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
    public void h(int i10) {
        switch (this.f31555a) {
            case 0:
                c8 c8Var = this.f31556b;
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
                c8 c8Var2 = this.f31556b;
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
                    c8Var2.f25850s.l();
                    if (z4 != SharedConfig.playOrderReversed) {
                        c8Var2.f25843n.B0();
                        c8Var2.w0(false);
                    }
                }
                c8Var2.H0();
                return;
            default:
                this.f31556b.t0(i10);
                return;
        }
    }
}
