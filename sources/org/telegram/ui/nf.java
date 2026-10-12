package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class nf implements Runnable {
    public final int f40396a;
    public final eo f40397b;
    public final int f40398c;

    public nf(eo eoVar, int i10, int i11) {
        this.f40396a = i11;
        this.f40397b = eoVar;
        this.f40398c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f40396a) {
            case 0:
                this.f40397b.getConnectionsManager().cancelRequest(this.f40398c, true);
                return;
            case 1:
                this.f40397b.F(this.f40398c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f40397b.getConnectionsManager().cancelRequest(this.f40398c, true);
                return;
            case 3:
                eo eoVar = this.f40397b;
                ak akVar = eoVar.f37478x0;
                if (akVar != null) {
                    int childCount = akVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = eoVar.f37478x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(eoVar.G3)) {
                            u1Var.g4(this.f40398c, true, true);
                        }
                    }
                }
                eoVar.G3 = null;
                return;
            case 4:
                this.f40397b.getConnectionsManager().cancelRequest(this.f40398c, true);
                return;
            case 5:
                eo.a0(this.f40397b, this.f40398c);
                return;
            case 6:
                this.f40397b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f40398c, new Object[0]));
                return;
            case 7:
                this.f40397b.getConnectionsManager().cancelRequest(this.f40398c, true);
                return;
            case 8:
                eo.j1(this.f40397b, this.f40398c);
                return;
            default:
                eo.f1(this.f40397b, this.f40398c);
                return;
        }
    }
}
