package org.telegram.ui.Components;
public final class jp implements tt0 {
    public final hp f35162a;
    public final lp f35163b;

    public jp(lp lpVar, hp hpVar) {
        this.f35163b = lpVar;
        this.f35162a = hpVar;
    }

    @Override
    public final void l(int i3) {
        lp lpVar = this.f35163b;
        lpVar.f35814r1 = i3;
        lpVar.J0(true);
    }

    @Override
    public final void p() {
        int measuredHeight = this.f35163b.f35809l1.getMeasuredHeight();
        hp hpVar = this.f35162a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}
