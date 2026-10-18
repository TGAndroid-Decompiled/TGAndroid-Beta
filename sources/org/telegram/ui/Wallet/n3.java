package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
public final class n3 implements Runnable {
    public final int f34627a;
    public final m5 f34628b;

    public n3(m5 m5Var, int i10) {
        this.f34627a = i10;
        this.f34628b = m5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        e0 e0Var;
        switch (this.f34627a) {
            case 0:
                m5.e0(this.f34628b);
                return;
            case 1:
                m5 m5Var = this.f34628b;
                m5Var.getClass();
                m5Var.presentFragment(new n8());
                return;
            case 2:
                m5 m5Var2 = this.f34628b;
                m5Var2.getClass();
                m5Var2.presentFragment(new fi.g());
                return;
            case 3:
                m5 m5Var3 = this.f34628b;
                z7 z7Var = m5Var3.f34578k0;
                if (z7Var != null && (e0Var = m5Var3.F0) != null) {
                    z7Var.a0(e0Var);
                }
                e0 e0Var2 = m5Var3.F0;
                if (e0Var2 != null && !e0Var2.f34160a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (m5Var3.f34574g0 != z10) {
                    m5Var3.E0(z10);
                }
                if (z10 && m5Var3.G0) {
                    m5Var3.H0();
                }
                u61 u61Var = m5Var3.f31197a;
                if (u61Var != null && u61Var.W2 != null) {
                    m5Var3.Q0(true);
                    return;
                }
                return;
            case 4:
                this.f34628b.n0(false);
                return;
            case 5:
                this.f34628b.x0();
                return;
            case 6:
                this.f34628b.w0();
                return;
            case 7:
                xc.a0(this.f34628b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                m5 m5Var4 = this.f34628b;
                if (m5Var4.S.isAttachedToWindow()) {
                    if (!m5Var4.f31197a.canScrollVertically(-1)) {
                        m5Var4.f31197a.V2.h1(0, 0);
                    }
                    m5Var4.S.requestLayout();
                    return;
                }
                return;
            case 9:
                m5 m5Var5 = this.f34628b;
                m5Var5.G = false;
                m5Var5.E.invalidate();
                return;
            case 10:
                m5.b0(this.f34628b);
                return;
            case 11:
                this.f34628b.M0();
                return;
            case 12:
                m5 m5Var6 = this.f34628b;
                m5Var6.S.post(new n3(m5Var6, 8));
                return;
            case 13:
                this.f34628b.w0();
                return;
            default:
                this.f34628b.w0();
                return;
        }
    }
}
