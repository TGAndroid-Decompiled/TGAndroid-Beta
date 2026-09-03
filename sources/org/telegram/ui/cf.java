package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class cf implements Runnable {
    public final int f33123a;
    public final zn f33124b;
    public final int f33125c;

    public cf(zn znVar, int i10, int i11) {
        this.f33123a = i11;
        this.f33124b = znVar;
        this.f33125c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        switch (this.f33123a) {
            case 0:
                this.f33124b.getConnectionsManager().cancelRequest(this.f33125c, true);
                return;
            case 1:
                this.f33124b.j(this.f33125c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f33124b.getConnectionsManager().cancelRequest(this.f33125c, true);
                return;
            case 3:
                zn znVar = this.f33124b;
                sj sjVar = znVar.f40759u0;
                if (sjVar != null) {
                    int childCount = sjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = znVar.f40759u0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.equals(znVar.D3)) {
                            s1Var.g4(this.f33125c, true, true);
                        }
                    }
                }
                znVar.D3 = null;
                return;
            case 4:
                this.f33124b.getConnectionsManager().cancelRequest(this.f33125c, true);
                return;
            case 5:
                zn.V(this.f33124b, this.f33125c);
                return;
            case 6:
                this.f33124b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33125c, new Object[0]));
                return;
            case 7:
                this.f33124b.getConnectionsManager().cancelRequest(this.f33125c, true);
                return;
            case 8:
                zn.e0(this.f33124b, this.f33125c);
                return;
            default:
                zn.e1(this.f33124b, this.f33125c);
                return;
        }
    }
}
