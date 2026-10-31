package org.telegram.ui;

import android.view.View;
public final class df implements Runnable {
    public final int f36756a;
    public final un f36757b;
    public final int f36758c;

    public df(un unVar, int i10, int i11) {
        this.f36756a = i11;
        this.f36757b = unVar;
        this.f36758c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        switch (this.f36756a) {
            case 0:
                this.f36757b.getConnectionsManager().cancelRequest(this.f36758c, true);
                return;
            case 1:
                this.f36757b.k(this.f36758c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f36757b.getConnectionsManager().cancelRequest(this.f36758c, true);
                return;
            case 3:
                un unVar = this.f36757b;
                vj vjVar = unVar.f42492z0;
                if (vjVar != null) {
                    int childCount = vjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = unVar.f42492z0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(unVar.U3)) {
                            q1Var.C3(this.f36758c, true, true);
                        }
                    }
                }
                unVar.U3 = null;
                return;
            case 4:
                this.f36757b.actionBar.getActionBarMenuOnItemClick().b(this.f36758c);
                return;
            case 5:
                this.f36757b.getConnectionsManager().cancelRequest(this.f36758c, true);
                return;
            case 6:
                un.e0(this.f36757b, this.f36758c);
                return;
            case 7:
                this.f36757b.actionBar.setSubtitle(org.telegram.messenger.cd.G(this.f36758c, "messages", new Object[0]));
                return;
            case 8:
                this.f36757b.getConnectionsManager().cancelRequest(this.f36758c, true);
                return;
            case 9:
                un.m1(this.f36757b, this.f36758c);
                return;
            default:
                un.z0(this.f36757b, this.f36758c);
                return;
        }
    }
}
