package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class gf implements Runnable {
    public final int f33960a;
    public final bo f33961b;
    public final int f33962c;

    public gf(bo boVar, int i10, int i11) {
        this.f33960a = i11;
        this.f33961b = boVar;
        this.f33962c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f33960a) {
            case 0:
                this.f33961b.getConnectionsManager().cancelRequest(this.f33962c, true);
                return;
            case 1:
                this.f33961b.F(this.f33962c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f33961b.getConnectionsManager().cancelRequest(this.f33962c, true);
                return;
            case 3:
                bo boVar = this.f33961b;
                vj vjVar = boVar.f32502x0;
                if (vjVar != null) {
                    int childCount = vjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = boVar.f32502x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(boVar.G3)) {
                            t1Var.g4(this.f33962c, true, true);
                        }
                    }
                }
                boVar.G3 = null;
                return;
            case 4:
                this.f33961b.getConnectionsManager().cancelRequest(this.f33962c, true);
                return;
            case 5:
                bo.V(this.f33961b, this.f33962c);
                return;
            case 6:
                this.f33961b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33962c, new Object[0]));
                return;
            case 7:
                this.f33961b.getConnectionsManager().cancelRequest(this.f33962c, true);
                return;
            case 8:
                bo.e0(this.f33961b, this.f33962c);
                return;
            default:
                bo.e1(this.f33961b, this.f33962c);
                return;
        }
    }
}
