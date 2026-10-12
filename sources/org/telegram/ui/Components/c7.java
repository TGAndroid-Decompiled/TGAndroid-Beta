package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
public final class c7 implements org.telegram.ui.ActionBar.q0, cm0 {
    public final int f23962a;
    public final m8 f23963b;

    public c7(m8 m8Var, int i10) {
        this.f23962a = i10;
        this.f23963b = m8Var;
    }

    @Override
    public boolean a(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        m8 m8Var = this.f23963b;
        if (z10) {
            if (!m8Var.t0()) {
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                m8Var.C0(xVar, xVar.getMessageObject());
                return true;
            }
            return false;
        }
        m8Var.getClass();
        return false;
    }

    @Override
    public void l(int i10) {
        switch (this.f23962a) {
            case 0:
                m8 m8Var = this.f23963b;
                m8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = m8.U0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        m8Var.F0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m8 m8Var2 = this.f23963b;
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
                    m8Var2.f27255s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        m8Var2.f27248n.B0();
                        m8Var2.x0(false);
                    }
                }
                m8Var2.H0();
                return;
            default:
                this.f23963b.u0(i10);
                return;
        }
    }
}
