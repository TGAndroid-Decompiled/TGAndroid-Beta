package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

public final class t6 implements org.telegram.ui.ActionBar.r0, rk0 {

    public final int f32655a;

    public final b8 f32656b;

    public t6(b8 b8Var, int i10) {
        this.f32655a = i10;
        this.f32656b = b8Var;
    }

    @Override
    public boolean a(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        b8 b8Var = this.f32656b;
        if (!z10) {
            b8Var.getClass();
            return false;
        }
        if (b8Var.s0()) {
            return false;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
        b8Var.B0(xVar, xVar.getMessageObject());
        return true;
    }

    @Override
    public void h(int i10) {
        switch (this.f32655a) {
            case 0:
                b8 b8Var = this.f32656b;
                b8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = b8.Q0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        b8Var.F0(true);
                        break;
                    }
                }
                break;
            case 1:
                b8 b8Var2 = this.f32656b;
                if (i10 == 1 || i10 == 2) {
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    b8Var2.f27033s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        b8Var2.f27026n.B0();
                        b8Var2.w0(false);
                    }
                } else if (i10 == 4) {
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
                b8Var2.H0();
                break;
            default:
                this.f32656b.t0(i10);
                break;
        }
    }
}
