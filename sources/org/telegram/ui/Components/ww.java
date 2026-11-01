package org.telegram.ui.Components;
public final class ww extends g.o {
    public final vy f32329c;

    public ww(vy vyVar) {
        this.f32329c = vyVar;
    }

    @Override
    public final int i(int i10) {
        vy vyVar = this.f32329c;
        ex exVar = vyVar.R;
        vw vwVar = vyVar.Q;
        s4.g0 adapter = vyVar.P.getAdapter();
        ux uxVar = vyVar.S;
        if (adapter == uxVar) {
            int d = uxVar.d(i10);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return vwVar.J;
            }
        } else if ((vyVar.f31945d0 && i10 == 0) || i10 == exVar.d || i10 == exVar.f25956c || i10 == exVar.f25957f || exVar.f25959r.indexOfKey(i10) >= 0 || exVar.f25961w.indexOfKey(i10) >= 0) {
            return vwVar.J;
        }
        return 1;
    }
}
