package org.telegram.ui.Components;
public final class dq implements ow0 {
    public final bq f25804a;
    public final fq f25805b;

    public dq(fq fqVar, bq bqVar) {
        this.f25805b = fqVar;
        this.f25804a = bqVar;
    }

    @Override
    public final void j(int i10) {
        fq fqVar = this.f25805b;
        fqVar.f26556r = i10;
        fqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f25805b.f26552c.getMeasuredHeight();
        bq bqVar = this.f25804a;
        bqVar.z(0 - bqVar.getScrollX(), measuredHeight - bqVar.getScrollY(), false);
    }
}
