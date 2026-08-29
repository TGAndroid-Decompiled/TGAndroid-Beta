package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class qg implements MessagesStorage.IntCallback {
    public final int f41718a;
    public final tn f41719b;

    public qg(tn tnVar, int i10) {
        this.f41718a = i10;
        this.f41719b = tnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f41718a) {
            case 0:
                tn tnVar = this.f41719b;
                if (tnVar.getParentActivity() != null && tnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.tc.a0(tnVar).m(org.telegram.ui.Components.sc.f32605r, i10, 0, 0, tnVar.f42746aa).j();
                    return;
                }
                return;
            case 1:
                tn tnVar2 = this.f41719b;
                if (i10 == 0) {
                    tnVar2.f42844i6 = false;
                    tnVar2.H9();
                    return;
                }
                tnVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                tn tnVar3 = this.f41719b;
                if (i10 == 0) {
                    tnVar3.Qc(true);
                    return;
                } else {
                    tnVar3.finishFragment();
                    return;
                }
        }
    }
}
