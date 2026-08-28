package org.telegram.ui.Components;
public final class qp implements av0 {
    public final op f32002a;
    public final sp f32003b;

    public qp(sp spVar, op opVar) {
        this.f32003b = spVar;
        this.f32002a = opVar;
    }

    @Override
    public final void h(int i9) {
        sp spVar = this.f32003b;
        spVar.f32538r = i9;
        spVar.p(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f32003b.f32534c.getMeasuredHeight();
        op opVar = this.f32002a;
        opVar.y(0 - opVar.getScrollX(), measuredHeight - opVar.getScrollY(), false);
    }
}
