package org.telegram.ui.Components;
public final class dq implements ow0 {
    public final bq f25799a;
    public final fq f25800b;

    public dq(fq fqVar, bq bqVar) {
        this.f25800b = fqVar;
        this.f25799a = bqVar;
    }

    @Override
    public final void j(int i10) {
        fq fqVar = this.f25800b;
        fqVar.f26551r = i10;
        fqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f25800b.f26547c.getMeasuredHeight();
        bq bqVar = this.f25799a;
        bqVar.z(0 - bqVar.getScrollX(), measuredHeight - bqVar.getScrollY(), false);
    }
}
