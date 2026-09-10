package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class gf implements Runnable {
    public final int f33082a;
    public final eo f33083b;
    public final int f33084c;

    public gf(eo eoVar, int i10, int i11) {
        this.f33082a = i11;
        this.f33083b = eoVar;
        this.f33084c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f33082a) {
            case 0:
                this.f33083b.getConnectionsManager().cancelRequest(this.f33084c, true);
                return;
            case 1:
                this.f33083b.E(this.f33084c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f33083b.getConnectionsManager().cancelRequest(this.f33084c, true);
                return;
            case 3:
                eo eoVar = this.f33083b;
                wj wjVar = eoVar.f32542x0;
                if (wjVar != null) {
                    int childCount = wjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = eoVar.f32542x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(eoVar.G3)) {
                            t1Var.g4(this.f33084c, true, true);
                        }
                    }
                }
                eoVar.G3 = null;
                return;
            case 4:
                this.f33083b.getConnectionsManager().cancelRequest(this.f33084c, true);
                return;
            case 5:
                eo.V(this.f33083b, this.f33084c);
                return;
            case 6:
                this.f33083b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33084c, new Object[0]));
                return;
            case 7:
                this.f33083b.getConnectionsManager().cancelRequest(this.f33084c, true);
                return;
            case 8:
                eo.e0(this.f33083b, this.f33084c);
                return;
            default:
                eo.e1(this.f33083b, this.f33084c);
                return;
        }
    }
}
