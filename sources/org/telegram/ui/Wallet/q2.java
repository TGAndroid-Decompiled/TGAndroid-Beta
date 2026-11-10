package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class q2 implements r2 {
    public final boolean[] f43043a;
    public final org.telegram.utils.twidget.i0 f43044b;

    public q2(boolean[] zArr, org.telegram.utils.twidget.i0 i0Var) {
        this.f43043a = zArr;
        this.f43044b = i0Var;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f43043a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43044b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f43043a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43044b.b();
    }

    public final void c() {
        boolean[] zArr = this.f43043a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f43044b;
        i0Var.f52846b.b(4, null, i0Var.f52847c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f43043a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f43044b;
        org.telegram.utils.twidget.n0.w(i0Var.f52845a, i0Var.f52846b, i0Var.f52847c, widgetQueryType, i0Var.d);
    }
}
