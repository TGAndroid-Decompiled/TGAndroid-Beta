package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class df implements Runnable {
    public final int f33105a;
    public final wn f33106b;
    public final int f33107c;

    public df(wn wnVar, int i10, int i11) {
        this.f33105a = i11;
        this.f33106b = wnVar;
        this.f33107c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f33105a) {
            case 0:
                this.f33106b.getConnectionsManager().cancelRequest(this.f33107c, true);
                return;
            case 1:
                this.f33106b.F(this.f33107c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f33106b.getConnectionsManager().cancelRequest(this.f33107c, true);
                return;
            case 3:
                wn wnVar = this.f33106b;
                rj rjVar = wnVar.f39696x0;
                if (rjVar != null) {
                    int childCount = rjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = wnVar.f39696x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(wnVar.G3)) {
                            u1Var.g4(this.f33107c, true, true);
                        }
                    }
                }
                wnVar.G3 = null;
                return;
            case 4:
                this.f33106b.getConnectionsManager().cancelRequest(this.f33107c, true);
                return;
            case 5:
                wn.V(this.f33106b, this.f33107c);
                return;
            case 6:
                this.f33106b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33107c, new Object[0]));
                return;
            case 7:
                this.f33106b.getConnectionsManager().cancelRequest(this.f33107c, true);
                return;
            case 8:
                wn.F0(this.f33106b, this.f33107c);
                return;
            default:
                wn.w1(this.f33106b, this.f33107c);
                return;
        }
    }
}
