package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ef implements Runnable {
    public final int f33279a;
    public final bo f33280b;
    public final int f33281c;

    public ef(bo boVar, int i10, int i11) {
        this.f33279a = i11;
        this.f33280b = boVar;
        this.f33281c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f33279a) {
            case 0:
                this.f33280b.getConnectionsManager().cancelRequest(this.f33281c, true);
                return;
            case 1:
                this.f33280b.F(this.f33281c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f33280b.getConnectionsManager().cancelRequest(this.f33281c, true);
                return;
            case 3:
                bo boVar = this.f33280b;
                uj ujVar = boVar.f32519x0;
                if (ujVar != null) {
                    int childCount = ujVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = boVar.f32519x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(boVar.G3)) {
                            t1Var.g4(this.f33281c, true, true);
                        }
                    }
                }
                boVar.G3 = null;
                return;
            case 4:
                this.f33280b.getConnectionsManager().cancelRequest(this.f33281c, true);
                return;
            case 5:
                bo.V(this.f33280b, this.f33281c);
                return;
            case 6:
                this.f33280b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f33281c, new Object[0]));
                return;
            case 7:
                this.f33280b.getConnectionsManager().cancelRequest(this.f33281c, true);
                return;
            case 8:
                bo.e0(this.f33280b, this.f33281c);
                return;
            default:
                bo.e1(this.f33280b, this.f33281c);
                return;
        }
    }
}
