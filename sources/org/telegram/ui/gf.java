package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class gf implements Runnable {
    public final int f33915a;
    public final xn f33916b;
    public final int f33917c;

    public gf(xn xnVar, int i10, int i11) {
        this.f33915a = i11;
        this.f33916b = xnVar;
        this.f33917c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f33915a) {
            case 0:
                this.f33916b.getConnectionsManager().cancelRequest(this.f33917c, true);
                return;
            case 1:
                this.f33916b.F(this.f33917c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f33916b.getConnectionsManager().cancelRequest(this.f33917c, true);
                return;
            case 3:
                xn xnVar = this.f33916b;
                tj tjVar = xnVar.f39977x0;
                if (tjVar != null) {
                    int childCount = tjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = xnVar.f39977x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(xnVar.G3)) {
                            u1Var.g4(this.f33917c, true, true);
                        }
                    }
                }
                xnVar.G3 = null;
                return;
            case 4:
                this.f33916b.getConnectionsManager().cancelRequest(this.f33917c, true);
                return;
            case 5:
                xn.V(this.f33916b, this.f33917c);
                return;
            case 6:
                this.f33916b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33917c, new Object[0]));
                return;
            case 7:
                this.f33916b.getConnectionsManager().cancelRequest(this.f33917c, true);
                return;
            case 8:
                xn.F0(this.f33916b, this.f33917c);
                return;
            default:
                xn.w1(this.f33916b, this.f33917c);
                return;
        }
    }
}
