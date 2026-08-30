package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class af implements Runnable {
    public final int f32562a;
    public final xn f32563b;
    public final int f32564c;

    public af(xn xnVar, int i10, int i11) {
        this.f32562a = i11;
        this.f32563b = xnVar;
        this.f32564c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f32562a) {
            case 0:
                this.f32563b.getConnectionsManager().cancelRequest(this.f32564c, true);
                return;
            case 1:
                this.f32563b.j(this.f32564c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f32563b.getConnectionsManager().cancelRequest(this.f32564c, true);
                return;
            case 3:
                xn xnVar = this.f32563b;
                qj qjVar = xnVar.f40193u0;
                if (qjVar != null) {
                    int childCount = qjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = xnVar.f40193u0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(xnVar.D3)) {
                            t1Var.g4(this.f32564c, true, true);
                        }
                    }
                }
                xnVar.D3 = null;
                return;
            case 4:
                this.f32563b.getConnectionsManager().cancelRequest(this.f32564c, true);
                return;
            case 5:
                xn.V(this.f32563b, this.f32564c);
                return;
            case 6:
                this.f32563b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f32564c, new Object[0]));
                return;
            case 7:
                this.f32563b.getConnectionsManager().cancelRequest(this.f32564c, true);
                return;
            case 8:
                xn.e0(this.f32563b, this.f32564c);
                return;
            default:
                xn.e1(this.f32563b, this.f32564c);
                return;
        }
    }
}
