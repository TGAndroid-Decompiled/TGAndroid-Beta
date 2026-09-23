package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ef implements Runnable {
    public final int f32909a;
    public final xn f32910b;
    public final int f32911c;

    public ef(xn xnVar, int i10, int i11) {
        this.f32909a = i11;
        this.f32910b = xnVar;
        this.f32911c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f32909a) {
            case 0:
                this.f32910b.getConnectionsManager().cancelRequest(this.f32911c, true);
                return;
            case 1:
                this.f32910b.F(this.f32911c, 0, 0, 0, false, true);
                return;
            case 2:
                this.f32910b.getConnectionsManager().cancelRequest(this.f32911c, true);
                return;
            case 3:
                xn xnVar = this.f32910b;
                rj rjVar = xnVar.f39596x0;
                if (rjVar != null) {
                    int childCount = rjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = xnVar.f39596x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(xnVar.G3)) {
                            t1Var.g4(this.f32911c, true, true);
                        }
                    }
                }
                xnVar.G3 = null;
                return;
            case 4:
                this.f32910b.getConnectionsManager().cancelRequest(this.f32911c, true);
                return;
            case 5:
                xn.V(this.f32910b, this.f32911c);
                return;
            case 6:
                this.f32910b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f32911c, new Object[0]));
                return;
            case 7:
                this.f32910b.getConnectionsManager().cancelRequest(this.f32911c, true);
                return;
            case 8:
                xn.f0(this.f32910b, this.f32911c);
                return;
            default:
                xn.e1(this.f32910b, this.f32911c);
                return;
        }
    }
}
