package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class af implements Runnable {
    public final int f35147a;
    public final xn f35148b;
    public final int f35149c;

    public af(xn xnVar, int i10, int i11) {
        this.f35147a = i11;
        this.f35148b = xnVar;
        this.f35149c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f35147a) {
            case 0:
                this.f35148b.getConnectionsManager().cancelRequest(this.f35149c, true);
                return;
            case 1:
                this.f35148b.j(this.f35149c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f35148b.getConnectionsManager().cancelRequest(this.f35149c, true);
                return;
            case 3:
                xn xnVar = this.f35148b;
                qj qjVar = xnVar.f43362u0;
                if (qjVar != null) {
                    int childCount = qjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = xnVar.f43362u0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(xnVar.D3)) {
                            t1Var.g4(this.f35149c, true, true);
                        }
                    }
                }
                xnVar.D3 = null;
                return;
            case 4:
                this.f35148b.getConnectionsManager().cancelRequest(this.f35149c, true);
                return;
            case 5:
                xn.V(this.f35148b, this.f35149c);
                return;
            case 6:
                this.f35148b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f35149c, new Object[0]));
                return;
            case 7:
                this.f35148b.getConnectionsManager().cancelRequest(this.f35149c, true);
                return;
            case 8:
                xn.e0(this.f35148b, this.f35149c);
                return;
            default:
                xn.e1(this.f35148b, this.f35149c);
                return;
        }
    }
}
