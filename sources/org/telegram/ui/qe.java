package org.telegram.ui;

import android.view.View;
public final class qe implements Runnable {
    public final int f49210a;
    public final an f49211b;
    public final int f49212c;

    public qe(an anVar, int i7, int i10) {
        this.f49210a = i10;
        this.f49211b = anVar;
        this.f49212c = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        switch (this.f49210a) {
            case 0:
                this.f49211b.getConnectionsManager().cancelRequest(this.f49212c, true);
                return;
            case 1:
                this.f49211b.l(this.f49212c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f49211b.getConnectionsManager().cancelRequest(this.f49212c, true);
                return;
            case 3:
                an anVar = this.f49211b;
                aj ajVar = anVar.f44043z0;
                if (ajVar != null) {
                    int childCount = ajVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = anVar.f44043z0.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(anVar.U3)) {
                            q1Var.G3(this.f49212c, true, true);
                        }
                    }
                }
                anVar.U3 = null;
                return;
            case 4:
                this.f49211b.actionBar.getActionBarMenuOnItemClick().b(this.f49212c);
                return;
            case 5:
                this.f49211b.getConnectionsManager().cancelRequest(this.f49212c, true);
                return;
            case 6:
                an.b0(this.f49211b, this.f49212c);
                return;
            case 7:
                this.f49211b.actionBar.setSubtitle(org.telegram.messenger.id.G(this.f49212c, "messages", new Object[0]));
                return;
            case 8:
                this.f49211b.getConnectionsManager().cancelRequest(this.f49212c, true);
                return;
            case 9:
                an.L0(this.f49211b, this.f49212c);
                return;
            default:
                an.Y0(this.f49211b, this.f49212c);
                return;
        }
    }
}
