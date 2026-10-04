package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class hf implements Runnable {
    public final int f37057a;
    public final yn f37058b;
    public final int f37059c;

    public hf(yn ynVar, int i10, int i11) {
        this.f37057a = i11;
        this.f37058b = ynVar;
        this.f37059c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f37057a) {
            case 0:
                this.f37058b.getConnectionsManager().cancelRequest(this.f37059c, true);
                return;
            case 1:
                this.f37058b.D(this.f37059c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f37058b.getConnectionsManager().cancelRequest(this.f37059c, true);
                return;
            case 3:
                yn ynVar = this.f37058b;
                sj sjVar = ynVar.f43526v0;
                if (sjVar != null) {
                    int childCount = sjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = ynVar.f43526v0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(ynVar.E3)) {
                            u1Var.g4(this.f37059c, true, true);
                        }
                    }
                }
                ynVar.E3 = null;
                return;
            case 4:
                this.f37058b.getConnectionsManager().cancelRequest(this.f37059c, true);
                return;
            case 5:
                yn.T(this.f37058b, this.f37059c);
                return;
            case 6:
                this.f37058b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f37059c, new Object[0]));
                return;
            case 7:
                this.f37058b.getConnectionsManager().cancelRequest(this.f37059c, true);
                return;
            case 8:
                yn.i0(this.f37058b, this.f37059c);
                return;
            default:
                yn.e1(this.f37058b, this.f37059c);
                return;
        }
    }
}
