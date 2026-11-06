package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;
public final class s2 implements t2 {
    public final boolean[] f43128a;
    public final org.telegram.utils.twidget.k f43129b;

    public s2(boolean[] zArr, org.telegram.utils.twidget.k kVar) {
        this.f43128a = zArr;
        this.f43129b = kVar;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.f43128a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43129b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.f43128a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f43129b.b();
    }

    public final void c() {
        boolean[] zArr = this.f43128a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f43129b;
        kVar.f52834b.a(4, null, kVar.f52835c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.f43128a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.f43129b;
        org.telegram.utils.twidget.p.u(kVar.f52833a, kVar.f52834b, kVar.f52835c, widgetQueryType, kVar.d);
    }
}
