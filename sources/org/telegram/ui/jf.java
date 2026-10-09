package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class jf implements Runnable {
    public final int f38927a;
    public final zn f38928b;
    public final int f38929c;

    public jf(zn znVar, int i10, int i11) {
        this.f38927a = i11;
        this.f38928b = znVar;
        this.f38929c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f38927a) {
            case 0:
                this.f38928b.getConnectionsManager().cancelRequest(this.f38929c, true);
                return;
            case 1:
                this.f38928b.F(this.f38929c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f38928b.getConnectionsManager().cancelRequest(this.f38929c, true);
                return;
            case 3:
                zn znVar = this.f38928b;
                wj wjVar = znVar.f44988x0;
                if (wjVar != null) {
                    int childCount = wjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = znVar.f44988x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(znVar.G3)) {
                            u1Var.g4(this.f38929c, true, true);
                        }
                    }
                }
                znVar.G3 = null;
                return;
            case 4:
                this.f38928b.getConnectionsManager().cancelRequest(this.f38929c, true);
                return;
            case 5:
                zn.a0(this.f38928b, this.f38929c);
                return;
            case 6:
                this.f38928b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f38929c, new Object[0]));
                return;
            case 7:
                this.f38928b.getConnectionsManager().cancelRequest(this.f38929c, true);
                return;
            case 8:
                zn.j1(this.f38928b, this.f38929c);
                return;
            default:
                zn.f1(this.f38928b, this.f38929c);
                return;
        }
    }
}
