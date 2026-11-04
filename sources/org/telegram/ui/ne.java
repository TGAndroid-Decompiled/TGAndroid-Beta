package org.telegram.ui;

import android.view.View;
public final class ne implements Runnable {
    public final int f47978a;
    public final wm f47979b;
    public final int f47980c;

    public ne(wm wmVar, int i3, int i10) {
        this.f47978a = i10;
        this.f47979b = wmVar;
        this.f47980c = i3;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        switch (this.f47978a) {
            case 0:
                this.f47979b.getConnectionsManager().cancelRequest(this.f47980c, true);
                return;
            case 1:
                this.f47979b.l(this.f47980c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f47979b.getConnectionsManager().cancelRequest(this.f47980c, true);
                return;
            case 3:
                wm wmVar = this.f47979b;
                wi wiVar = wmVar.A0;
                if (wiVar != null) {
                    int childCount = wiVar.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = wmVar.A0.getChildAt(i3);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(wmVar.V3)) {
                            q1Var.E3(this.f47980c, true, true);
                        }
                    }
                }
                wmVar.V3 = null;
                return;
            case 4:
                this.f47979b.actionBar.getActionBarMenuOnItemClick().b(this.f47980c);
                return;
            case 5:
                this.f47979b.getConnectionsManager().cancelRequest(this.f47980c, true);
                return;
            case 6:
                wm.b0(this.f47979b, this.f47980c);
                return;
            case 7:
                this.f47979b.actionBar.setSubtitle(org.telegram.messenger.bd.G(this.f47980c, "messages", new Object[0]));
                return;
            case 8:
                this.f47979b.getConnectionsManager().cancelRequest(this.f47980c, true);
                return;
            case 9:
                wm.L0(this.f47979b, this.f47980c);
                return;
            default:
                wm.Y0(this.f47979b, this.f47980c);
                return;
        }
    }
}
