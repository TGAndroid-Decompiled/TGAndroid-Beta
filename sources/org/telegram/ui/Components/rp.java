package org.telegram.ui.Components;
public final class rp implements vt0 {
    public final pp f39018a;
    public final tp f39019b;

    public rp(tp tpVar, pp ppVar) {
        this.f39019b = tpVar;
        this.f39018a = ppVar;
    }

    @Override
    public final void l(int i7) {
        tp tpVar = this.f39019b;
        tpVar.f39774u1 = i7;
        tpVar.J0(true);
    }

    @Override
    public final void p() {
        int measuredHeight = this.f39019b.f39768o1.getMeasuredHeight();
        pp ppVar = this.f39018a;
        ppVar.z(0 - ppVar.getScrollX(), measuredHeight - ppVar.getScrollY(), false);
    }
}
