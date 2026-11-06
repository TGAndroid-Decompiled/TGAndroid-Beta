package org.telegram.ui;

import android.view.View;
public final class qe implements Runnable {
    public final int f49208a;
    public final an f49209b;
    public final int f49210c;

    public qe(an anVar, int i7, int i10) {
        this.f49208a = i10;
        this.f49209b = anVar;
        this.f49210c = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        switch (this.f49208a) {
            case 0:
                this.f49209b.getConnectionsManager().cancelRequest(this.f49210c, true);
                return;
            case 1:
                this.f49209b.l(this.f49210c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f49209b.getConnectionsManager().cancelRequest(this.f49210c, true);
                return;
            case 3:
                an anVar = this.f49209b;
                aj ajVar = anVar.f44038z0;
                if (ajVar != null) {
                    int childCount = ajVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = anVar.f44038z0.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(anVar.U3)) {
                            q1Var.F3(this.f49210c, true, true);
                        }
                    }
                }
                anVar.U3 = null;
                return;
            case 4:
                this.f49209b.actionBar.getActionBarMenuOnItemClick().b(this.f49210c);
                return;
            case 5:
                this.f49209b.getConnectionsManager().cancelRequest(this.f49210c, true);
                return;
            case 6:
                an.b0(this.f49209b, this.f49210c);
                return;
            case 7:
                this.f49209b.actionBar.setSubtitle(org.telegram.messenger.hd.G(this.f49210c, "messages", new Object[0]));
                return;
            case 8:
                this.f49209b.getConnectionsManager().cancelRequest(this.f49210c, true);
                return;
            case 9:
                an.L0(this.f49209b, this.f49210c);
                return;
            default:
                an.Y0(this.f49209b, this.f49210c);
                return;
        }
    }
}
