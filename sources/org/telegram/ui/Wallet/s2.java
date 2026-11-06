package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class s2 implements t2 {
    public final boolean[] f43103a;
    public final org.telegram.utils.twidget.k f43104b;

    public s2(boolean[] zArr, org.telegram.utils.twidget.k kVar) {
        this.f43103a = zArr;
        this.f43104b = kVar;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f43103a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43104b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f43103a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43104b.b();
    }

    public final void c() {
        boolean[] zArr = this.f43103a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f43104b;
        kVar.f52808b.a(4, null, kVar.f52809c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f43103a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f43104b;
        org.telegram.utils.twidget.p.u(kVar.f52807a, kVar.f52808b, kVar.f52809c, widgetQueryType, kVar.d);
    }
}
