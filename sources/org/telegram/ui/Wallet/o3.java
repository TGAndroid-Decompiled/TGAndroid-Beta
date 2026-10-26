package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.wc;
public final class o3 implements Runnable {
    public final int f37057a;
    public final m5 f37058b;

    public o3(m5 m5Var, int i10) {
        this.f37057a = i10;
        this.f37058b = m5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        d0 d0Var;
        switch (this.f37057a) {
            case 0:
                m5.a0(this.f37058b);
                return;
            case 1:
                m5 m5Var = this.f37058b;
                m5Var.getClass();
                m5Var.presentFragment(new h8());
                return;
            case 2:
                m5 m5Var2 = this.f37058b;
                m5Var2.getClass();
                m5Var2.presentFragment(new gi.h());
                return;
            case 3:
                m5 m5Var3 = this.f37058b;
                t7 t7Var = m5Var3.f36946j0;
                if (t7Var != null && (d0Var = m5Var3.E0) != null) {
                    t7Var.Y(d0Var);
                }
                d0 d0Var2 = m5Var3.E0;
                if (d0Var2 != null && !d0Var2.f36442a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (m5Var3.f36942f0 != z10) {
                    m5Var3.H0(z10);
                }
                if (z10 && m5Var3.F0) {
                    n8 n8Var = m5Var3.f36945i0;
                    if (n8Var != null) {
                        n8Var.b(false);
                    }
                    if (!m5Var3.f36942f0) {
                        m5Var3.F0 = true;
                    } else {
                        m5Var3.F0 = false;
                        m5Var3.f36940e0 = 1;
                        fi.h1 h1Var = m5Var3.f36952p0;
                        if (h1Var != null) {
                            h1Var.setPosition(1);
                        }
                    }
                }
                l71 l71Var = m5Var3.f30419a;
                if (l71Var != null && l71Var.f32152g3 != null) {
                    m5Var3.T0(true);
                    return;
                }
                return;
            case 4:
                this.f37058b.o0(false);
                return;
            case 5:
                this.f37058b.A0();
                return;
            case 6:
                this.f37058b.z0();
                return;
            case 7:
                m5 m5Var4 = this.f37058b;
                if (m5Var4.R.isAttachedToWindow()) {
                    if (!m5Var4.f30419a.canScrollVertically(-1)) {
                        m5Var4.f30419a.f32151f3.h1(0, 0);
                    }
                    m5Var4.R.requestLayout();
                    return;
                }
                return;
            case 8:
                this.f37058b.M0 = null;
                return;
            case 9:
                m5.d0(this.f37058b);
                return;
            case 10:
                this.f37058b.P0();
                return;
            case 11:
                wc.b0(this.f37058b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 12:
                m5 m5Var5 = this.f37058b;
                m5Var5.R.post(new o3(m5Var5, 7));
                return;
            case 13:
                this.f37058b.z0();
                return;
            default:
                this.f37058b.z0();
                return;
        }
    }
}
