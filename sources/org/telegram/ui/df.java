package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class df implements Runnable {
    public final int f36176a;
    public final sn f36177b;
    public final int f36178c;

    public df(sn snVar, int i10, int i11) {
        this.f36176a = i11;
        this.f36177b = snVar;
        this.f36178c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f36176a) {
            case 0:
                this.f36177b.getConnectionsManager().cancelRequest(this.f36178c, true);
                return;
            case 1:
                this.f36177b.j(this.f36178c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f36177b.getConnectionsManager().cancelRequest(this.f36178c, true);
                return;
            case 3:
                sn snVar = this.f36177b;
                pj pjVar = snVar.f41419x0;
                if (pjVar != null) {
                    int childCount = pjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = snVar.f41419x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(snVar.G3)) {
                            u1Var.g4(this.f36178c, true, true);
                        }
                    }
                }
                snVar.G3 = null;
                return;
            case 4:
                this.f36177b.getConnectionsManager().cancelRequest(this.f36178c, true);
                return;
            case 5:
                sn.a0(this.f36177b, this.f36178c);
                return;
            case 6:
                this.f36177b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f36178c, new Object[0]));
                return;
            case 7:
                this.f36177b.getConnectionsManager().cancelRequest(this.f36178c, true);
                return;
            case 8:
                sn.j1(this.f36177b, this.f36178c);
                return;
            default:
                sn.f1(this.f36177b, this.f36178c);
                return;
        }
    }
}
