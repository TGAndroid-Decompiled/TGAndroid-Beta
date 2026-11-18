package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class w2 implements x2 {
    public final boolean[] f45198a;
    public final org.telegram.utils.twidget.i0 f45199b;

    public w2(boolean[] zArr, org.telegram.utils.twidget.i0 i0Var) {
        this.f45198a = zArr;
        this.f45199b = i0Var;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f45198a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f45199b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f45198a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f45199b.b();
    }

    public final void c() {
        boolean[] zArr = this.f45198a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f45199b;
        i0Var.f54785b.b(4, null, i0Var.f54786c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f45198a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f45199b;
        org.telegram.utils.twidget.n0.w(i0Var.f54784a, i0Var.f54785b, i0Var.f54786c, widgetQueryType, i0Var.d);
    }
}
