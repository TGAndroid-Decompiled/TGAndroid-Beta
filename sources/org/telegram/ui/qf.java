package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class qf implements View.OnLongClickListener {
    public final int f37401a;
    public final zn f37402b;

    public qf(zn znVar, int i10) {
        this.f37401a = i10;
        this.f37402b = znVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f37401a) {
            case 0:
                zn znVar = this.f37402b;
                MessageObject messageObject3 = znVar.f40515a5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(znVar.getParentActivity()), znVar.f40534ba).k(false).j();
                }
                return true;
            case 1:
                return zn.R0(this.f37402b);
            default:
                zn znVar2 = this.f37402b;
                int i10 = znVar2.f40660lb;
                if (i10 == 1 && (messageObject2 = znVar2.f40666m5) != null) {
                    znVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (znVar2.f40542c5 != null && i10 == 2 && (messageObject = znVar2.f40642k5) != null) {
                    znVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
