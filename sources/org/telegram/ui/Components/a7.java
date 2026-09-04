package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class a7 implements org.telegram.ui.ActionBar.r0, bl0 {
    public final int f24294a;
    public final k8 f24295b;

    public a7(k8 k8Var, int i10) {
        this.f24294a = i10;
        this.f24295b = k8Var;
    }

    @Override
    public boolean a(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        k8 k8Var = this.f24295b;
        if (z10) {
            if (!k8Var.s0()) {
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                k8Var.B0(xVar, xVar.getMessageObject());
                return true;
            }
            return false;
        }
        k8Var.getClass();
        return false;
    }

    @Override
    public void m(int i10) {
        switch (this.f24294a) {
            case 0:
                k8 k8Var = this.f24295b;
                k8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = k8.U0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        k8Var.F0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k8 k8Var2 = this.f24295b;
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
                    k8Var2.f27736s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        k8Var2.f27729n.B0();
                        k8Var2.w0(false);
                    }
                }
                k8Var2.H0();
                return;
            default:
                this.f24295b.t0(i10);
                return;
        }
    }
}
