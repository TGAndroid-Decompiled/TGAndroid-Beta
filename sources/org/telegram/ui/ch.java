package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ch implements MessagesStorage.IntCallback {
    public final int f32719a;
    public final xn f32720b;

    public ch(xn xnVar, int i10) {
        this.f32719a = i10;
        this.f32720b = xnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f32719a) {
            case 0:
                xn xnVar = this.f32720b;
                if (xnVar.getParentActivity() != null && xnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(xnVar).m(org.telegram.ui.Components.wc.f29914r, i10, 0, 0, xnVar.f39750ea).j();
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f32720b;
                if (i10 == 0) {
                    xnVar2.f39843m6 = false;
                    xnVar2.H9();
                    return;
                }
                xnVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                xn xnVar3 = this.f32720b;
                if (i10 == 0) {
                    xnVar3.Qc(true);
                    return;
                } else {
                    xnVar3.finishFragment();
                    return;
                }
        }
    }
}
