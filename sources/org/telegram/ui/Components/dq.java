package org.telegram.ui.Components;
public final class dq implements ow0 {
    public final bq f25798a;
    public final fq f25799b;

    public dq(fq fqVar, bq bqVar) {
        this.f25799b = fqVar;
        this.f25798a = bqVar;
    }

    @Override
    public final void j(int i10) {
        fq fqVar = this.f25799b;
        fqVar.f26550r = i10;
        fqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f25799b.f26546c.getMeasuredHeight();
        bq bqVar = this.f25798a;
        bqVar.z(0 - bqVar.getScrollX(), measuredHeight - bqVar.getScrollY(), false);
    }
}
