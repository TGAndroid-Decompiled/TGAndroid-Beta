package org.telegram.ui;

import android.view.View;
public final class cf implements Runnable {
    public final int f36308a;
    public final un f36309b;
    public final int f36310c;

    public cf(un unVar, int i10, int i11) {
        this.f36308a = i11;
        this.f36309b = unVar;
        this.f36310c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.kj messageObject;
        switch (this.f36308a) {
            case 0:
                this.f36309b.getConnectionsManager().cancelRequest(this.f36310c, true);
                return;
            case 1:
                this.f36309b.l(this.f36310c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f36309b.getConnectionsManager().cancelRequest(this.f36310c, true);
                return;
            case 3:
                un unVar = this.f36309b;
                vj vjVar = unVar.f42303z0;
                if (vjVar != null) {
                    int childCount = vjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = unVar.f42303z0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(unVar.U3)) {
                            q1Var.C3(this.f36310c, true, true);
                        }
                    }
                }
                unVar.U3 = null;
                return;
            case 4:
                this.f36309b.actionBar.getActionBarMenuOnItemClick().b(this.f36310c);
                return;
            case 5:
                this.f36309b.getConnectionsManager().cancelRequest(this.f36310c, true);
                return;
            case 6:
                un.b0(this.f36309b, this.f36310c);
                return;
            case 7:
                this.f36309b.actionBar.setSubtitle(org.telegram.messenger.dd.G(this.f36310c, "messages", new Object[0]));
                return;
            case 8:
                this.f36309b.getConnectionsManager().cancelRequest(this.f36310c, true);
                return;
            case 9:
                un.N0(this.f36309b, this.f36310c);
                return;
            default:
                un.H1(this.f36309b, this.f36310c);
                return;
        }
    }
}
