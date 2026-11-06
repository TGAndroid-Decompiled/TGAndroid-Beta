package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class s2 implements t2 {
    public final boolean[] f43127a;
    public final org.telegram.utils.twidget.k f43128b;

    public s2(boolean[] zArr, org.telegram.utils.twidget.k kVar) {
        this.f43127a = zArr;
        this.f43128b = kVar;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f43127a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43128b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f43127a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43128b.b();
    }

    public final void c() {
        boolean[] zArr = this.f43127a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f43128b;
        kVar.f52832b.a(4, null, kVar.f52833c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f43127a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f43128b;
        org.telegram.utils.twidget.p.u(kVar.f52831a, kVar.f52832b, kVar.f52833c, widgetQueryType, kVar.d);
    }
}
