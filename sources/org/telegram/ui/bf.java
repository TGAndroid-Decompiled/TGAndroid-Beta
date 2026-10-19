package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class bf implements Runnable {
    public final int f35629a;
    public final qn f35630b;
    public final int f35631c;

    public bf(qn qnVar, int i10, int i11) {
        this.f35629a = i11;
        this.f35630b = qnVar;
        this.f35631c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f35629a) {
            case 0:
                this.f35630b.getConnectionsManager().cancelRequest(this.f35631c, true);
                return;
            case 1:
                this.f35630b.j(this.f35631c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f35630b.getConnectionsManager().cancelRequest(this.f35631c, true);
                return;
            case 3:
                qn qnVar = this.f35630b;
                nj njVar = qnVar.f40903x0;
                if (njVar != null) {
                    int childCount = njVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = qnVar.f40903x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(qnVar.G3)) {
                            u1Var.g4(this.f35631c, true, true);
                        }
                    }
                }
                qnVar.G3 = null;
                return;
            case 4:
                this.f35630b.getConnectionsManager().cancelRequest(this.f35631c, true);
                return;
            case 5:
                qn.a0(this.f35630b, this.f35631c);
                return;
            case 6:
                this.f35630b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f35631c, new Object[0]));
                return;
            case 7:
                this.f35630b.getConnectionsManager().cancelRequest(this.f35631c, true);
                return;
            case 8:
                qn.j1(this.f35630b, this.f35631c);
                return;
            default:
                qn.f1(this.f35630b, this.f35631c);
                return;
        }
    }
}
