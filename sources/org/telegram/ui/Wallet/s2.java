package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class s2 implements t2 {
    public final boolean[] f35181a;
    public final org.telegram.utils.twidget.k f35182b;

    public s2(boolean[] zArr, org.telegram.utils.twidget.k kVar) {
        this.f35181a = zArr;
        this.f35182b = kVar;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f35181a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f35182b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f35181a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f35182b.b();
    }

    public final void c() {
        boolean[] zArr = this.f35181a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f35182b;
        kVar.f44377b.a(4, null, kVar.f44378c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f35181a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f35182b;
        org.telegram.utils.twidget.p.u(kVar.f44376a, kVar.f44377b, kVar.f44378c, widgetQueryType, kVar.d);
    }
}
