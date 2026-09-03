package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class af implements Runnable {
    public final int f35154a;
    public final xn f35155b;
    public final int f35156c;

    public af(xn xnVar, int i10, int i11) {
        this.f35154a = i11;
        this.f35155b = xnVar;
        this.f35156c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f35154a) {
            case 0:
                this.f35155b.getConnectionsManager().cancelRequest(this.f35156c, true);
                return;
            case 1:
                this.f35155b.j(this.f35156c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f35155b.getConnectionsManager().cancelRequest(this.f35156c, true);
                return;
            case 3:
                xn xnVar = this.f35155b;
                qj qjVar = xnVar.f43340u0;
                if (qjVar != null) {
                    int childCount = qjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = xnVar.f43340u0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(xnVar.D3)) {
                            t1Var.g4(this.f35156c, true, true);
                        }
                    }
                }
                xnVar.D3 = null;
                return;
            case 4:
                this.f35155b.getConnectionsManager().cancelRequest(this.f35156c, true);
                return;
            case 5:
                xn.V(this.f35155b, this.f35156c);
                return;
            case 6:
                this.f35155b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f35156c, new Object[0]));
                return;
            case 7:
                this.f35155b.getConnectionsManager().cancelRequest(this.f35156c, true);
                return;
            case 8:
                xn.e0(this.f35155b, this.f35156c);
                return;
            default:
                xn.e1(this.f35155b, this.f35156c);
                return;
        }
    }
}
