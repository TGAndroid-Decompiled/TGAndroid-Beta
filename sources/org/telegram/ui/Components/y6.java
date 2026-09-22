package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class y6 implements org.telegram.ui.ActionBar.r0, ol0 {
    public final int f30532a;
    public final i8 f30533b;

    public y6(i8 i8Var, int i10) {
        this.f30532a = i10;
        this.f30533b = i8Var;
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        i8 i8Var = this.f30533b;
        if (z10) {
            if (!i8Var.s0()) {
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                i8Var.B0(xVar, xVar.getMessageObject());
                return true;
            }
            return false;
        }
        i8Var.getClass();
        return false;
    }

    @Override
    public void m(int i10) {
        switch (this.f30532a) {
            case 0:
                i8 i8Var = this.f30533b;
                i8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = i8.U0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        i8Var.F0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i8 i8Var2 = this.f30533b;
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
                    i8Var2.f25019s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        i8Var2.f25012n.C0();
                        i8Var2.w0(false);
                    }
                }
                i8Var2.H0();
                return;
            default:
                this.f30533b.t0(i10);
                return;
        }
    }
}
