package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class qm implements Runnable {
    public final int f40807a;
    public final fn f40808b;
    public final org.telegram.messenger.kj f40809c;

    public qm(fn fnVar, org.telegram.messenger.kj kjVar, int i10) {
        this.f40807a = i10;
        this.f40808b = fnVar;
        this.f40809c = kjVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40807a) {
            case 0:
                fn fnVar = this.f40808b;
                un unVar = fnVar.f37191a;
                unVar.c8();
                UndoView undoView = unVar.M3;
                if (undoView != null) {
                    if (unVar.Z.getVisibility() == 0 && unVar.S.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    org.telegram.messenger.kj kjVar = this.f40809c;
                    undoView.k(0L, i11, kjVar.C0(), null, null, new qm(fnVar, kjVar, 2));
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f40808b.f37191a;
                unVar2.Sb = this.f40809c.f1();
                unVar2.Tb = 0;
                return;
            default:
                un unVar3 = this.f40808b.f37191a;
                if (unVar3.r7()) {
                    org.telegram.messenger.pz b10 = org.telegram.messenger.pz.b(this.f40809c.C0(), unVar3.f42108j6, unVar3.D5, unVar3.l4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = unVar3.T8();
                    unVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
