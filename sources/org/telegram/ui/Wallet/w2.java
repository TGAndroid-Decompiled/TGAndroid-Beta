package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class w2 implements x2 {
    public final boolean[] f45239a;
    public final org.telegram.utils.twidget.i0 f45240b;

    public w2(boolean[] zArr, org.telegram.utils.twidget.i0 i0Var) {
        this.f45239a = zArr;
        this.f45240b = i0Var;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f45239a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f45240b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f45239a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f45240b.b();
    }

    public final void c() {
        boolean[] zArr = this.f45239a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f45240b;
        i0Var.f54827b.b(4, null, i0Var.f54828c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f45239a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f45240b;
        org.telegram.utils.twidget.n0.w(i0Var.f54826a, i0Var.f54827b, i0Var.f54828c, widgetQueryType, i0Var.d);
    }
}
