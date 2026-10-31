package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class qm implements Runnable {
    public final int f41003a;
    public final fn f41004b;
    public final org.telegram.messenger.jj f41005c;

    public qm(fn fnVar, org.telegram.messenger.jj jjVar, int i10) {
        this.f41003a = i10;
        this.f41004b = fnVar;
        this.f41005c = jjVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41003a) {
            case 0:
                fn fnVar = this.f41004b;
                un unVar = fnVar.f37301a;
                unVar.Y7();
                UndoView undoView = unVar.M3;
                if (undoView != null) {
                    if (unVar.Z.getVisibility() == 0 && unVar.S.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    org.telegram.messenger.jj jjVar = this.f41005c;
                    undoView.k(0L, i11, jjVar.C0(), null, null, new qm(fnVar, jjVar, 2));
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f41004b.f37301a;
                unVar2.Rb = this.f41005c.f1();
                unVar2.Sb = 0;
                return;
            default:
                un unVar3 = this.f41004b.f37301a;
                if (unVar3.n7()) {
                    org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(this.f41005c.C0(), unVar3.f42297j6, unVar3.D5, unVar3.l4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = unVar3.P8();
                    unVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
