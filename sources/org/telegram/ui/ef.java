package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ef implements Runnable {
    public final int f36013a;
    public final co f36014b;
    public final int f36015c;

    public ef(co coVar, int i10, int i11) {
        this.f36013a = i11;
        this.f36014b = coVar;
        this.f36015c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f36013a) {
            case 0:
                this.f36014b.getConnectionsManager().cancelRequest(this.f36015c, true);
                return;
            case 1:
                this.f36014b.F(this.f36015c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f36014b.getConnectionsManager().cancelRequest(this.f36015c, true);
                return;
            case 3:
                co coVar = this.f36014b;
                uj ujVar = coVar.f35473x0;
                if (ujVar != null) {
                    int childCount = ujVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coVar.f35473x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(coVar.G3)) {
                            t1Var.g4(this.f36015c, true, true);
                        }
                    }
                }
                coVar.G3 = null;
                return;
            case 4:
                this.f36014b.getConnectionsManager().cancelRequest(this.f36015c, true);
                return;
            case 5:
                co.V(this.f36014b, this.f36015c);
                return;
            case 6:
                this.f36014b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f36015c, new Object[0]));
                return;
            case 7:
                this.f36014b.getConnectionsManager().cancelRequest(this.f36015c, true);
                return;
            case 8:
                co.e0(this.f36014b, this.f36015c);
                return;
            default:
                co.e1(this.f36014b, this.f36015c);
                return;
        }
    }
}
