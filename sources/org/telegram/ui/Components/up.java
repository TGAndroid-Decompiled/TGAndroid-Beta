package org.telegram.ui.Components;
public final class up implements kv0 {
    public final sp f33286a;
    public final wp f33287b;

    public up(wp wpVar, sp spVar) {
        this.f33287b = wpVar;
        this.f33286a = spVar;
    }

    @Override
    public final void h(int i10) {
        wp wpVar = this.f33287b;
        wpVar.f34478r = i10;
        wpVar.p(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f33287b.f34474c.getMeasuredHeight();
        sp spVar = this.f33286a;
        spVar.y(0 - spVar.getScrollX(), measuredHeight - spVar.getScrollY(), false);
    }
}
