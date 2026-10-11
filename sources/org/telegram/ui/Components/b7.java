package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class b7 implements org.telegram.ui.ActionBar.q0, im0 {
    public final int f24869a;
    public final l8 f24870b;

    public b7(l8 l8Var, int i10) {
        this.f24869a = i10;
        this.f24870b = l8Var;
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        l8 l8Var = this.f24870b;
        if (z10) {
            if (!l8Var.t0()) {
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                l8Var.C0(xVar, xVar.getMessageObject());
                return true;
            }
            return false;
        }
        l8Var.getClass();
        return false;
    }

    @Override
    public void m(int i10) {
        switch (this.f24869a) {
            case 0:
                l8 l8Var = this.f24870b;
                l8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = l8.U0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        l8Var.F0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l8 l8Var2 = this.f24870b;
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
                    l8Var2.f28219s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        l8Var2.f28212n.B0();
                        l8Var2.x0(false);
                    }
                }
                l8Var2.H0();
                return;
            default:
                this.f24870b.u0(i10);
                return;
        }
    }
}
