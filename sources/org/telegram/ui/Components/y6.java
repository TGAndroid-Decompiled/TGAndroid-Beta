package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class y6 implements org.telegram.ui.ActionBar.s0, ll0 {
    public final int f29253a;
    public final j8 f29254b;

    public y6(j8 j8Var, int i10) {
        this.f29253a = i10;
        this.f29254b = j8Var;
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        j8 j8Var = this.f29254b;
        if (z10) {
            if (!j8Var.s0()) {
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                j8Var.B0(xVar, xVar.getMessageObject());
                return true;
            }
            return false;
        }
        j8Var.getClass();
        return false;
    }

    @Override
    public void m(int i10) {
        switch (this.f29253a) {
            case 0:
                j8 j8Var = this.f29254b;
                j8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = j8.U0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        j8Var.F0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j8 j8Var2 = this.f29254b;
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
                    j8Var2.f24298s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        j8Var2.f24291n.B0();
                        j8Var2.w0(false);
                    }
                }
                j8Var2.H0();
                return;
            default:
                this.f29254b.t0(i10);
                return;
        }
    }
}
