package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ch implements MessagesStorage.IntCallback {
    public final int f32780a;
    public final zn f32781b;

    public ch(zn znVar, int i10) {
        this.f32780a = i10;
        this.f32781b = znVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f32780a) {
            case 0:
                zn znVar = this.f32781b;
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(znVar).m(org.telegram.ui.Components.wc.f29995r, i10, 0, 0, znVar.f40324ea).j();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f32781b;
                if (i10 == 0) {
                    znVar2.f40417m6 = false;
                    znVar2.H9();
                    return;
                }
                znVar2.E(i10, 0, 0, 0, false, true);
                return;
            default:
                zn znVar3 = this.f32781b;
                if (i10 == 0) {
                    znVar3.Qc(true);
                    return;
                } else {
                    znVar3.finishFragment();
                    return;
                }
        }
    }
}
