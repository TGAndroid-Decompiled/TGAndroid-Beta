package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class c7 implements org.telegram.ui.ActionBar.r0, bm0 {
    public final int f27080a;
    public final m8 f27081b;

    public c7(m8 m8Var, int i10) {
        this.f27080a = i10;
        this.f27081b = m8Var;
    }

    @Override
    public boolean c(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        m8 m8Var = this.f27081b;
        if (z10) {
            if (!m8Var.z0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                m8Var.I0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        m8Var.getClass();
        return false;
    }

    @Override
    public void g(int i10) {
        switch (this.f27080a) {
            case 0:
                m8 m8Var = this.f27081b;
                m8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = m8.Z0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        m8Var.L0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m8 m8Var2 = this.f27081b;
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
                    m8Var2.f30442s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        m8Var2.f30435n.C0();
                        m8Var2.D0(false);
                    }
                }
                m8Var2.N0();
                return;
            default:
                this.f27081b.A0(i10);
                return;
        }
    }
}
