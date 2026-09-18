package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class x6 implements org.telegram.ui.ActionBar.s0, cl0 {
    public final int f29859a;
    public final h8 f29860b;

    public x6(h8 h8Var, int i10) {
        this.f29859a = i10;
        this.f29860b = h8Var;
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        h8 h8Var = this.f29860b;
        if (z10) {
            if (!h8Var.s0()) {
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                h8Var.B0(xVar, xVar.getMessageObject());
                return true;
            }
            return false;
        }
        h8Var.getClass();
        return false;
    }

    @Override
    public void m(int i10) {
        switch (this.f29859a) {
            case 0:
                h8 h8Var = this.f29860b;
                h8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = h8.U0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        h8Var.F0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h8 h8Var2 = this.f29860b;
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
                    h8Var2.f24568s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        h8Var2.f24561n.C0();
                        h8Var2.w0(false);
                    }
                }
                h8Var2.H0();
                return;
            default:
                this.f29860b.t0(i10);
                return;
        }
    }
}
