package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class nf implements Runnable {
    public final int f40399a;
    public final eo f40400b;
    public final int f40401c;

    public nf(eo eoVar, int i10, int i11) {
        this.f40399a = i11;
        this.f40400b = eoVar;
        this.f40401c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f40399a) {
            case 0:
                this.f40400b.getConnectionsManager().cancelRequest(this.f40401c, true);
                return;
            case 1:
                this.f40400b.F(this.f40401c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f40400b.getConnectionsManager().cancelRequest(this.f40401c, true);
                return;
            case 3:
                eo eoVar = this.f40400b;
                ak akVar = eoVar.f37483x0;
                if (akVar != null) {
                    int childCount = akVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = eoVar.f37483x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(eoVar.G3)) {
                            u1Var.g4(this.f40401c, true, true);
                        }
                    }
                }
                eoVar.G3 = null;
                return;
            case 4:
                this.f40400b.getConnectionsManager().cancelRequest(this.f40401c, true);
                return;
            case 5:
                eo.a0(this.f40400b, this.f40401c);
                return;
            case 6:
                this.f40400b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f40401c, new Object[0]));
                return;
            case 7:
                this.f40400b.getConnectionsManager().cancelRequest(this.f40401c, true);
                return;
            case 8:
                eo.j1(this.f40400b, this.f40401c);
                return;
            default:
                eo.f1(this.f40400b, this.f40401c);
                return;
        }
    }
}
