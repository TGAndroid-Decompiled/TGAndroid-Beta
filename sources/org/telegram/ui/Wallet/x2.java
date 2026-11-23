package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class x2 implements y2 {
    public final boolean[] f45370a;
    public final org.telegram.utils.twidget.i0 f45371b;

    public x2(boolean[] zArr, org.telegram.utils.twidget.i0 i0Var) {
        this.f45370a = zArr;
        this.f45371b = i0Var;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f45370a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f45371b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f45370a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f45371b.b();
    }

    public final void c() {
        boolean[] zArr = this.f45370a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f45371b;
        i0Var.f54912b.b(4, null, i0Var.f54913c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f45370a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.f45371b;
        org.telegram.utils.twidget.n0.w(i0Var.f54911a, i0Var.f54912b, i0Var.f54913c, widgetQueryType, i0Var.d);
    }
}
