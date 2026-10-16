package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.zc;
public final class g3 implements Runnable {
    public final int f32948a;
    public final a5 f32949b;

    public g3(a5 a5Var, int i10) {
        this.f32948a = i10;
        this.f32949b = a5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f32948a) {
            case 0:
                a5 a5Var = this.f32949b;
                a5Var.S.post(new g3(a5Var, 8));
                return;
            case 1:
                a5.e0(this.f32949b);
                return;
            case 2:
                a5 a5Var2 = this.f32949b;
                a5Var2.getClass();
                a5Var2.presentFragment(new l7());
                return;
            case 3:
                a5 a5Var3 = this.f32949b;
                a5Var3.getClass();
                a5Var3.presentFragment(new ei.i());
                return;
            case 4:
                a5 a5Var4 = this.f32949b;
                c0 c0Var = a5Var4.A0;
                if (c0Var != null && !c0Var.f32716a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (a5Var4.f32643g0 != z10) {
                    a5Var4.w0(z10);
                }
                c71 c71Var = a5Var4.f24003a;
                if (c71Var != null && c71Var.W2 != null) {
                    a5Var4.F0(true);
                    return;
                }
                return;
            case 5:
                this.f32949b.q0();
                return;
            case 6:
                this.f32949b.p0();
                return;
            case 7:
                zc.a0(this.f32949b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 8:
                a5 a5Var5 = this.f32949b;
                if (a5Var5.S.isAttachedToWindow()) {
                    if (!a5Var5.f24003a.canScrollVertically(-1)) {
                        a5Var5.f24003a.V2.h1(0, 0);
                    }
                    a5Var5.S.requestLayout();
                    return;
                }
                return;
            case 9:
                a5 a5Var6 = this.f32949b;
                a5Var6.G = false;
                a5Var6.E.invalidate();
                return;
            case 10:
                a5.b0(this.f32949b);
                return;
            case 11:
                this.f32949b.C0();
                return;
            case 12:
                this.f32949b.p0();
                return;
            default:
                this.f32949b.p0();
                return;
        }
    }
}
