package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class of implements Runnable {
    public final int f38942a;
    public final fo f38943b;
    public final int f38944c;

    public of(fo foVar, int i10, int i11) {
        this.f38942a = i11;
        this.f38943b = foVar;
        this.f38944c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        switch (this.f38942a) {
            case 0:
                this.f38943b.getConnectionsManager().cancelRequest(this.f38944c, true);
                return;
            case 1:
                this.f38943b.j(this.f38944c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f38943b.getConnectionsManager().cancelRequest(this.f38944c, true);
                return;
            case 3:
                fo foVar = this.f38943b;
                ak akVar = foVar.f36160x0;
                if (akVar != null) {
                    int childCount = akVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = foVar.f36160x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(foVar.G3)) {
                            u1Var.g4(this.f38944c, true, true);
                        }
                    }
                }
                foVar.G3 = null;
                return;
            case 4:
                this.f38943b.getConnectionsManager().cancelRequest(this.f38944c, true);
                return;
            case 5:
                fo.a0(this.f38943b, this.f38944c);
                return;
            case 6:
                this.f38943b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f38944c, new Object[0]));
                return;
            case 7:
                this.f38943b.getConnectionsManager().cancelRequest(this.f38944c, true);
                return;
            case 8:
                fo.j1(this.f38943b, this.f38944c);
                return;
            default:
                fo.f1(this.f38943b, this.f38944c);
                return;
        }
    }
}
