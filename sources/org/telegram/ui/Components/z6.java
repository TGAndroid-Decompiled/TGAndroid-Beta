package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class z6 implements org.telegram.ui.ActionBar.r0, ol0 {
    public final int f33391a;
    public final j8 f33392b;

    public z6(j8 j8Var, int i10) {
        this.f33391a = i10;
        this.f33392b = j8Var;
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        j8 j8Var = this.f33392b;
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
        switch (this.f33391a) {
            case 0:
                j8 j8Var = this.f33392b;
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
                j8 j8Var2 = this.f33392b;
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
                    j8Var2.f27645s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        j8Var2.f27638n.C0();
                        j8Var2.w0(false);
                    }
                }
                j8Var2.H0();
                return;
            default:
                this.f33392b.t0(i10);
                return;
        }
    }
}
