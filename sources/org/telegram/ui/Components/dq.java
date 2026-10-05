package org.telegram.ui.Components;
public final class dq implements pw0 {
    public final bq f25838a;
    public final fq f25839b;

    public dq(fq fqVar, bq bqVar) {
        this.f25839b = fqVar;
        this.f25838a = bqVar;
    }

    @Override
    public final void j(int i10) {
        fq fqVar = this.f25839b;
        fqVar.f26561r = i10;
        fqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f25839b.f26557c.getMeasuredHeight();
        bq bqVar = this.f25838a;
        bqVar.z(0 - bqVar.getScrollX(), measuredHeight - bqVar.getScrollY(), false);
    }
}
