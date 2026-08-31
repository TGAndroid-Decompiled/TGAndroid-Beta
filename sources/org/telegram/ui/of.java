package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class of implements View.OnLongClickListener {
    public final int f39741a;
    public final xn f39742b;

    public of(xn xnVar, int i10) {
        this.f39741a = i10;
        this.f39742b = xnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f39741a) {
            case 0:
                xn xnVar = this.f39742b;
                MessageObject messageObject3 = xnVar.f43117a5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.f43136ba).k(false).j();
                }
                return true;
            case 1:
                return xn.R0(this.f39742b);
            default:
                xn xnVar2 = this.f39742b;
                int i10 = xnVar2.f43263lb;
                if (i10 == 1 && (messageObject2 = xnVar2.f43269m5) != null) {
                    xnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (xnVar2.f43144c5 != null && i10 == 2 && (messageObject = xnVar2.f43245k5) != null) {
                    xnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
