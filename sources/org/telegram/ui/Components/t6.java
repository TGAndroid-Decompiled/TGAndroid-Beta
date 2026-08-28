package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class t6 implements org.telegram.ui.ActionBar.s0, ok0 {
    public final int f32630a;
    public final c8 f32631b;

    public t6(c8 c8Var, int i9) {
        this.f32630a = i9;
        this.f32631b = c8Var;
    }

    @Override
    public boolean a(int i9, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        c8 c8Var = this.f32631b;
        if (z10) {
            if (!c8Var.r0()) {
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                c8Var.A0(xVar, xVar.getMessageObject());
                return true;
            }
            return false;
        }
        c8Var.getClass();
        return false;
    }

    @Override
    public void i(int i9) {
        switch (this.f32630a) {
            case 0:
                c8 c8Var = this.f32631b;
                c8Var.getClass();
                if (i9 >= 0) {
                    float[] fArr = c8.Q0;
                    if (i9 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i9]);
                        c8Var.E0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c8 c8Var2 = this.f32631b;
                if (i9 != 1 && i9 != 2) {
                    if (i9 == 4) {
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
                    if ((z10 && i9 == 1) || (SharedConfig.shuffleMusic && i9 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i9);
                    }
                    c8Var2.f27401s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        c8Var2.f27394n.B0();
                        c8Var2.v0(false);
                    }
                }
                c8Var2.G0();
                return;
            default:
                this.f32631b.s0(i9);
                return;
        }
    }
}
