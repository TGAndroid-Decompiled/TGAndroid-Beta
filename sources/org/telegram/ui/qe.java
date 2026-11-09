package org.telegram.ui;

import android.view.View;
public final class qe implements Runnable {
    public final int f49031a;
    public final cn f49032b;
    public final int f49033c;

    public qe(cn cnVar, int i7, int i10) {
        this.f49031a = i10;
        this.f49032b = cnVar;
        this.f49033c = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        switch (this.f49031a) {
            case 0:
                this.f49032b.getConnectionsManager().cancelRequest(this.f49033c, true);
                return;
            case 1:
                this.f49032b.l(this.f49033c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f49032b.getConnectionsManager().cancelRequest(this.f49033c, true);
                return;
            case 3:
                cn cnVar = this.f49032b;
                cj cjVar = cnVar.f44700z0;
                if (cjVar != null) {
                    int childCount = cjVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = cnVar.f44700z0.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(cnVar.U3)) {
                            q1Var.G3(this.f49033c, true, true);
                        }
                    }
                }
                cnVar.U3 = null;
                return;
            case 4:
                this.f49032b.actionBar.getActionBarMenuOnItemClick().b(this.f49033c);
                return;
            case 5:
                this.f49032b.getConnectionsManager().cancelRequest(this.f49033c, true);
                return;
            case 6:
                cn.c0(this.f49032b, this.f49033c);
                return;
            case 7:
                this.f49032b.actionBar.setSubtitle(org.telegram.messenger.id.G(this.f49033c, "messages", new Object[0]));
                return;
            case 8:
                this.f49032b.getConnectionsManager().cancelRequest(this.f49033c, true);
                return;
            case 9:
                cn.O0(this.f49032b, this.f49033c);
                return;
            default:
                cn.d1(this.f49032b, this.f49033c);
                return;
        }
    }
}
