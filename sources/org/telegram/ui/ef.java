package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ef implements Runnable {
    public final int f33348a;
    public final zn f33349b;
    public final int f33350c;

    public ef(zn znVar, int i10, int i11) {
        this.f33348a = i11;
        this.f33349b = znVar;
        this.f33350c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f33348a) {
            case 0:
                this.f33349b.getConnectionsManager().cancelRequest(this.f33350c, true);
                return;
            case 1:
                this.f33349b.E(this.f33350c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f33349b.getConnectionsManager().cancelRequest(this.f33350c, true);
                return;
            case 3:
                zn znVar = this.f33349b;
                uj ujVar = znVar.f40551x0;
                if (ujVar != null) {
                    int childCount = ujVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = znVar.f40551x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(znVar.G3)) {
                            u1Var.g4(this.f33350c, true, true);
                        }
                    }
                }
                znVar.G3 = null;
                return;
            case 4:
                this.f33349b.getConnectionsManager().cancelRequest(this.f33350c, true);
                return;
            case 5:
                zn.V(this.f33349b, this.f33350c);
                return;
            case 6:
                this.f33349b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33350c, new Object[0]));
                return;
            case 7:
                this.f33349b.getConnectionsManager().cancelRequest(this.f33350c, true);
                return;
            case 8:
                zn.G0(this.f33349b, this.f33350c);
                return;
            default:
                zn.w1(this.f33349b, this.f33350c);
                return;
        }
    }
}
