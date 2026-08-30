package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class of implements View.OnLongClickListener {
    public final int f36887a;
    public final xn f36888b;

    public of(xn xnVar, int i10) {
        this.f36887a = i10;
        this.f36888b = xnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f36887a) {
            case 0:
                xn xnVar = this.f36888b;
                MessageObject messageObject3 = xnVar.f39949a5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.f39968ba).k(false).j();
                }
                return true;
            case 1:
                return xn.R0(this.f36888b);
            default:
                xn xnVar2 = this.f36888b;
                int i10 = xnVar2.f40094lb;
                if (i10 == 1 && (messageObject2 = xnVar2.f40100m5) != null) {
                    xnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (xnVar2.f39976c5 != null && i10 == 2 && (messageObject = xnVar2.f40076k5) != null) {
                    xnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
