package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class q2 implements r2 {
    public final boolean[] f43008a;
    public final org.telegram.utils.twidget.i0 f43009b;

    public q2(boolean[] zArr, org.telegram.utils.twidget.i0 i0Var) {
        this.f43008a = zArr;
        this.f43009b = i0Var;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f43008a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43009b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f43008a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43009b.b();
    }

    public final void c() {
        boolean[] zArr = this.f43008a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f43009b;
        i0Var.f52847b.b(4, null, i0Var.f52848c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f43008a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f43009b;
        org.telegram.utils.twidget.n0.w(i0Var.f52846a, i0Var.f52847b, i0Var.f52848c, widgetQueryType, i0Var.d);
    }
}
