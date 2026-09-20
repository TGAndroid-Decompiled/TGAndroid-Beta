package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ef implements Runnable {
    public final int f33328a;
    public final zn f33329b;
    public final int f33330c;

    public ef(zn znVar, int i10, int i11) {
        this.f33328a = i11;
        this.f33329b = znVar;
        this.f33330c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f33328a) {
            case 0:
                this.f33329b.getConnectionsManager().cancelRequest(this.f33330c, true);
                return;
            case 1:
                this.f33329b.F(this.f33330c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f33329b.getConnectionsManager().cancelRequest(this.f33330c, true);
                return;
            case 3:
                zn znVar = this.f33329b;
                tj tjVar = znVar.f40530x0;
                if (tjVar != null) {
                    int childCount = tjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = znVar.f40530x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(znVar.G3)) {
                            u1Var.g4(this.f33330c, true, true);
                        }
                    }
                }
                znVar.G3 = null;
                return;
            case 4:
                this.f33329b.getConnectionsManager().cancelRequest(this.f33330c, true);
                return;
            case 5:
                zn.V(this.f33329b, this.f33330c);
                return;
            case 6:
                this.f33329b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33330c, new Object[0]));
                return;
            case 7:
                this.f33329b.getConnectionsManager().cancelRequest(this.f33330c, true);
                return;
            case 8:
                zn.G0(this.f33329b, this.f33330c);
                return;
            default:
                zn.w1(this.f33329b, this.f33330c);
                return;
        }
    }
}
