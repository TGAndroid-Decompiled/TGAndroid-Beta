package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class bf implements Runnable {
    public final int f35624a;
    public final qn f35625b;
    public final int f35626c;

    public bf(qn qnVar, int i10, int i11) {
        this.f35624a = i11;
        this.f35625b = qnVar;
        this.f35626c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f35624a) {
            case 0:
                this.f35625b.getConnectionsManager().cancelRequest(this.f35626c, true);
                return;
            case 1:
                this.f35625b.j(this.f35626c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f35625b.getConnectionsManager().cancelRequest(this.f35626c, true);
                return;
            case 3:
                qn qnVar = this.f35625b;
                nj njVar = qnVar.f40905x0;
                if (njVar != null) {
                    int childCount = njVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = qnVar.f40905x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(qnVar.G3)) {
                            u1Var.g4(this.f35626c, true, true);
                        }
                    }
                }
                qnVar.G3 = null;
                return;
            case 4:
                this.f35625b.getConnectionsManager().cancelRequest(this.f35626c, true);
                return;
            case 5:
                qn.a0(this.f35625b, this.f35626c);
                return;
            case 6:
                this.f35625b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f35626c, new Object[0]));
                return;
            case 7:
                this.f35625b.getConnectionsManager().cancelRequest(this.f35626c, true);
                return;
            case 8:
                qn.j1(this.f35625b, this.f35626c);
                return;
            default:
                qn.f1(this.f35625b, this.f35626c);
                return;
        }
    }
}
