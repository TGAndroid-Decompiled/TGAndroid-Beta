package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ef implements Runnable {
    public final int f33269a;
    public final zn f33270b;
    public final int f33271c;

    public ef(zn znVar, int i10, int i11) {
        this.f33269a = i11;
        this.f33270b = znVar;
        this.f33271c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f33269a) {
            case 0:
                this.f33270b.getConnectionsManager().cancelRequest(this.f33271c, true);
                return;
            case 1:
                this.f33270b.F(this.f33271c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f33270b.getConnectionsManager().cancelRequest(this.f33271c, true);
                return;
            case 3:
                zn znVar = this.f33270b;
                tj tjVar = znVar.f40488x0;
                if (tjVar != null) {
                    int childCount = tjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = znVar.f40488x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(znVar.G3)) {
                            u1Var.g4(this.f33271c, true, true);
                        }
                    }
                }
                znVar.G3 = null;
                return;
            case 4:
                this.f33270b.getConnectionsManager().cancelRequest(this.f33271c, true);
                return;
            case 5:
                zn.V(this.f33270b, this.f33271c);
                return;
            case 6:
                this.f33270b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33271c, new Object[0]));
                return;
            case 7:
                this.f33270b.getConnectionsManager().cancelRequest(this.f33271c, true);
                return;
            case 8:
                zn.G0(this.f33270b, this.f33271c);
                return;
            default:
                zn.w1(this.f33270b, this.f33271c);
                return;
        }
    }
}
