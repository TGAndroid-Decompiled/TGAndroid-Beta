package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class gf implements Runnable {
    public final int f33964a;
    public final bo f33965b;
    public final int f33966c;

    public gf(bo boVar, int i10, int i11) {
        this.f33964a = i11;
        this.f33965b = boVar;
        this.f33966c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f33964a) {
            case 0:
                this.f33965b.getConnectionsManager().cancelRequest(this.f33966c, true);
                return;
            case 1:
                this.f33965b.F(this.f33966c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f33965b.getConnectionsManager().cancelRequest(this.f33966c, true);
                return;
            case 3:
                bo boVar = this.f33965b;
                vj vjVar = boVar.f32506x0;
                if (vjVar != null) {
                    int childCount = vjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = boVar.f32506x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(boVar.G3)) {
                            t1Var.g4(this.f33966c, true, true);
                        }
                    }
                }
                boVar.G3 = null;
                return;
            case 4:
                this.f33965b.getConnectionsManager().cancelRequest(this.f33966c, true);
                return;
            case 5:
                bo.V(this.f33965b, this.f33966c);
                return;
            case 6:
                this.f33965b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33966c, new Object[0]));
                return;
            case 7:
                this.f33965b.getConnectionsManager().cancelRequest(this.f33966c, true);
                return;
            case 8:
                bo.e0(this.f33965b, this.f33966c);
                return;
            default:
                bo.e1(this.f33965b, this.f33966c);
                return;
        }
    }
}
