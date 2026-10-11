package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class hf implements Runnable {
    public final int f38429a;
    public final zn f38430b;
    public final int f38431c;

    public hf(zn znVar, int i10, int i11) {
        this.f38429a = i11;
        this.f38430b = znVar;
        this.f38431c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f38429a) {
            case 0:
                this.f38430b.getConnectionsManager().cancelRequest(this.f38431c, true);
                return;
            case 1:
                this.f38430b.F(this.f38431c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f38430b.getConnectionsManager().cancelRequest(this.f38431c, true);
                return;
            case 3:
                zn znVar = this.f38430b;
                wj wjVar = znVar.f45023x0;
                if (wjVar != null) {
                    int childCount = wjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = znVar.f45023x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(znVar.G3)) {
                            u1Var.g4(this.f38431c, true, true);
                        }
                    }
                }
                znVar.G3 = null;
                return;
            case 4:
                this.f38430b.getConnectionsManager().cancelRequest(this.f38431c, true);
                return;
            case 5:
                zn.a0(this.f38430b, this.f38431c);
                return;
            case 6:
                this.f38430b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f38431c, new Object[0]));
                return;
            case 7:
                this.f38430b.getConnectionsManager().cancelRequest(this.f38431c, true);
                return;
            case 8:
                zn.j1(this.f38430b, this.f38431c);
                return;
            default:
                zn.f1(this.f38430b, this.f38431c);
                return;
        }
    }
}
