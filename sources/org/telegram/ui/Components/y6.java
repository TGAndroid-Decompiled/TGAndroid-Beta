package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class y6 implements org.telegram.ui.ActionBar.q0, bm0 {
    public final int f32825a;
    public final i8 f32826b;

    public y6(i8 i8Var, int i10) {
        this.f32825a = i10;
        this.f32826b = i8Var;
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        i8 i8Var = this.f32826b;
        if (z10) {
            if (!i8Var.z0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                i8Var.I0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        i8Var.getClass();
        return false;
    }

    @Override
    public void h(int i10) {
        switch (this.f32825a) {
            case 0:
                i8 i8Var = this.f32826b;
                i8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = i8.Z0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        i8Var.L0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i8 i8Var2 = this.f32826b;
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
                    i8Var2.f27347s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        i8Var2.f27340n.B0();
                        i8Var2.D0(false);
                    }
                }
                i8Var2.N0();
                return;
            default:
                this.f32826b.A0(i10);
                return;
        }
    }
}
