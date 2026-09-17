package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ef implements Runnable {
    public final int f36014a;
    public final co f36015b;
    public final int f36016c;

    public ef(co coVar, int i10, int i11) {
        this.f36014a = i11;
        this.f36015b = coVar;
        this.f36016c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f36014a) {
            case 0:
                this.f36015b.getConnectionsManager().cancelRequest(this.f36016c, true);
                return;
            case 1:
                this.f36015b.F(this.f36016c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f36015b.getConnectionsManager().cancelRequest(this.f36016c, true);
                return;
            case 3:
                co coVar = this.f36015b;
                uj ujVar = coVar.f35474x0;
                if (ujVar != null) {
                    int childCount = ujVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coVar.f35474x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(coVar.G3)) {
                            t1Var.g4(this.f36016c, true, true);
                        }
                    }
                }
                coVar.G3 = null;
                return;
            case 4:
                this.f36015b.getConnectionsManager().cancelRequest(this.f36016c, true);
                return;
            case 5:
                co.V(this.f36015b, this.f36016c);
                return;
            case 6:
                this.f36015b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f36016c, new Object[0]));
                return;
            case 7:
                this.f36015b.getConnectionsManager().cancelRequest(this.f36016c, true);
                return;
            case 8:
                co.e0(this.f36015b, this.f36016c);
                return;
            default:
                co.e1(this.f36015b, this.f36016c);
                return;
        }
    }
}
