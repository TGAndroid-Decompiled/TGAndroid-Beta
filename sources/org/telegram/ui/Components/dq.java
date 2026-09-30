package org.telegram.ui.Components;
public final class dq implements gw0 {
    public final bq f23698a;
    public final fq f23699b;

    public dq(fq fqVar, bq bqVar) {
        this.f23699b = fqVar;
        this.f23698a = bqVar;
    }

    @Override
    public final void h(int i10) {
        fq fqVar = this.f23699b;
        fqVar.f24332r = i10;
        fqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f23699b.f24329c.getMeasuredHeight();
        bq bqVar = this.f23698a;
        bqVar.y(0 - bqVar.getScrollX(), measuredHeight - bqVar.getScrollY(), false);
    }
}
