package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class q2 implements r2 {
    public final boolean[] f43080a;
    public final org.telegram.utils.twidget.k f43081b;

    public q2(boolean[] zArr, org.telegram.utils.twidget.k kVar) {
        this.f43080a = zArr;
        this.f43081b = kVar;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f43080a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43081b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f43080a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43081b.b();
    }

    public final void c() {
        boolean[] zArr = this.f43080a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f43081b;
        kVar.f52899b.a(4, null, kVar.f52900c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f43080a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f43081b;
        org.telegram.utils.twidget.p.u(kVar.f52898a, kVar.f52899b, kVar.f52900c, widgetQueryType, kVar.d);
    }
}
