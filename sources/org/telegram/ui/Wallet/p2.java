package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class p2 implements q2 {
    public final boolean[] f44301a;
    public final org.telegram.utils.twidget.i0 f44302b;

    public p2(boolean[] zArr, org.telegram.utils.twidget.i0 i0Var) {
        this.f44301a = zArr;
        this.f44302b = i0Var;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f44301a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f44302b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f44301a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f44302b.b();
    }

    public final void c() {
        boolean[] zArr = this.f44301a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f44302b;
        i0Var.f54254b.b(4, null, i0Var.f54255c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f44301a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f44302b;
        org.telegram.utils.twidget.n0.w(i0Var.f54253a, i0Var.f54254b, i0Var.f54255c, widgetQueryType, i0Var.d);
    }
}
