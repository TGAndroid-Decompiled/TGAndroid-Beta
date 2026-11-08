package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class r2 implements s2 {
    public final boolean[] f43090a;
    public final org.telegram.utils.twidget.i0 f43091b;

    public r2(boolean[] zArr, org.telegram.utils.twidget.i0 i0Var) {
        this.f43090a = zArr;
        this.f43091b = i0Var;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f43090a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43091b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f43090a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43091b.b();
    }

    public final void c() {
        boolean[] zArr = this.f43090a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f43091b;
        i0Var.f52833b.b(4, null, i0Var.f52834c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f43090a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f43091b;
        org.telegram.utils.twidget.n0.w(i0Var.f52832a, i0Var.f52833b, i0Var.f52834c, widgetQueryType, i0Var.d);
    }
}
