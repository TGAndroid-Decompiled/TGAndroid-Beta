package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class df implements Runnable {
    public final int f36183a;
    public final sn f36184b;
    public final int f36185c;

    public df(sn snVar, int i10, int i11) {
        this.f36183a = i11;
        this.f36184b = snVar;
        this.f36185c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f36183a) {
            case 0:
                this.f36184b.getConnectionsManager().cancelRequest(this.f36185c, true);
                return;
            case 1:
                this.f36184b.j(this.f36185c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f36184b.getConnectionsManager().cancelRequest(this.f36185c, true);
                return;
            case 3:
                sn snVar = this.f36184b;
                pj pjVar = snVar.f41433x0;
                if (pjVar != null) {
                    int childCount = pjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = snVar.f41433x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(snVar.G3)) {
                            u1Var.g4(this.f36185c, true, true);
                        }
                    }
                }
                snVar.G3 = null;
                return;
            case 4:
                this.f36184b.getConnectionsManager().cancelRequest(this.f36185c, true);
                return;
            case 5:
                sn.a0(this.f36184b, this.f36185c);
                return;
            case 6:
                this.f36184b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f36185c, new Object[0]));
                return;
            case 7:
                this.f36184b.getConnectionsManager().cancelRequest(this.f36185c, true);
                return;
            case 8:
                sn.j1(this.f36184b, this.f36185c);
                return;
            default:
                sn.f1(this.f36184b, this.f36185c);
                return;
        }
    }
}
