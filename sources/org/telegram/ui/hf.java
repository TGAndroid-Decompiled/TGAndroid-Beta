package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class hf implements Runnable {
    public final int f37076a;
    public final yn f37077b;
    public final int f37078c;

    public hf(yn ynVar, int i10, int i11) {
        this.f37076a = i11;
        this.f37077b = ynVar;
        this.f37078c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f37076a) {
            case 0:
                this.f37077b.getConnectionsManager().cancelRequest(this.f37078c, true);
                return;
            case 1:
                this.f37077b.D(this.f37078c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f37077b.getConnectionsManager().cancelRequest(this.f37078c, true);
                return;
            case 3:
                yn ynVar = this.f37077b;
                sj sjVar = ynVar.f43526v0;
                if (sjVar != null) {
                    int childCount = sjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = ynVar.f43526v0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(ynVar.E3)) {
                            u1Var.g4(this.f37078c, true, true);
                        }
                    }
                }
                ynVar.E3 = null;
                return;
            case 4:
                this.f37077b.getConnectionsManager().cancelRequest(this.f37078c, true);
                return;
            case 5:
                yn.T(this.f37077b, this.f37078c);
                return;
            case 6:
                this.f37077b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f37078c, new Object[0]));
                return;
            case 7:
                this.f37077b.getConnectionsManager().cancelRequest(this.f37078c, true);
                return;
            case 8:
                yn.i0(this.f37077b, this.f37078c);
                return;
            default:
                yn.e1(this.f37077b, this.f37078c);
                return;
        }
    }
}
