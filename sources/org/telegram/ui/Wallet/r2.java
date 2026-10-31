package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class r2 implements s2 {
    public final boolean[] f35110a;
    public final org.telegram.utils.twidget.k f35111b;

    public r2(boolean[] zArr, org.telegram.utils.twidget.k kVar) {
        this.f35110a = zArr;
        this.f35111b = kVar;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f35110a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f35111b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f35110a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f35111b.b();
    }

    public final void c() {
        boolean[] zArr = this.f35110a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f35111b;
        kVar.f44366b.a(4, null, kVar.f44367c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f35110a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f35111b;
        org.telegram.utils.twidget.p.u(kVar.f44365a, kVar.f44366b, kVar.f44367c, widgetQueryType, kVar.d);
    }
}
