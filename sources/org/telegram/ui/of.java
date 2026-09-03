package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class of implements View.OnLongClickListener {
    public final int f39687a;
    public final xn f39688b;

    public of(xn xnVar, int i10) {
        this.f39687a = i10;
        this.f39688b = xnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f39687a) {
            case 0:
                xn xnVar = this.f39688b;
                MessageObject messageObject3 = xnVar.f43095a5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.f43114ba).k(false).j();
                }
                return true;
            case 1:
                return xn.R0(this.f39688b);
            default:
                xn xnVar2 = this.f39688b;
                int i10 = xnVar2.f43241lb;
                if (i10 == 1 && (messageObject2 = xnVar2.f43247m5) != null) {
                    xnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (xnVar2.f43122c5 != null && i10 == 2 && (messageObject = xnVar2.f43223k5) != null) {
                    xnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
