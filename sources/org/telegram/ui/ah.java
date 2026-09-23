package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ah implements MessagesStorage.IntCallback {
    public final int f31792a;
    public final xn f31793b;

    public ah(xn xnVar, int i10) {
        this.f31792a = i10;
        this.f31793b = xnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f31792a) {
            case 0:
                xn xnVar = this.f31793b;
                if (xnVar.getParentActivity() != null && xnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(xnVar).m(org.telegram.ui.Components.wc.f29600r, i10, 0, 0, xnVar.f39370ea).j();
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f31793b;
                if (i10 == 0) {
                    xnVar2.f39462m6 = false;
                    xnVar2.H9();
                    return;
                }
                xnVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                xn xnVar3 = this.f31793b;
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
