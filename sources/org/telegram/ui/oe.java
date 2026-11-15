package org.telegram.ui;

import android.view.View;
public final class oe implements Runnable {
    public final int f49934a;
    public final an f49935b;
    public final int f49936c;

    public oe(an anVar, int i7, int i10) {
        this.f49934a = i10;
        this.f49935b = anVar;
        this.f49936c = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        switch (this.f49934a) {
            case 0:
                this.f49935b.getConnectionsManager().cancelRequest(this.f49936c, true);
                return;
            case 1:
                this.f49935b.l(this.f49936c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f49935b.getConnectionsManager().cancelRequest(this.f49936c, true);
                return;
            case 3:
                an anVar = this.f49935b;
                aj ajVar = anVar.A0;
                if (ajVar != null) {
                    int childCount = ajVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = anVar.A0.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(anVar.V3)) {
                            q1Var.H3(this.f49936c, true, true);
                        }
                    }
                }
                anVar.V3 = null;
                return;
            case 4:
                this.f49935b.actionBar.getActionBarMenuOnItemClick().b(this.f49936c);
                return;
            case 5:
                this.f49935b.getConnectionsManager().cancelRequest(this.f49936c, true);
                return;
            case 6:
                an.c0(this.f49935b, this.f49936c);
                return;
            case 7:
                this.f49935b.actionBar.setSubtitle(org.telegram.messenger.hd.G(this.f49936c, "messages", new Object[0]));
                return;
            case 8:
                this.f49935b.getConnectionsManager().cancelRequest(this.f49936c, true);
                return;
            case 9:
                an.O0(this.f49935b, this.f49936c);
                return;
            default:
                an.d1(this.f49935b, this.f49936c);
                return;
        }
    }
}
