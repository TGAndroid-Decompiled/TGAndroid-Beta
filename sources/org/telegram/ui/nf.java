package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class nf implements View.OnLongClickListener {
    public final int f41881a;
    public final un f41882b;

    public nf(un unVar, int i10) {
        this.f41881a = i10;
        this.f41882b = unVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f41881a) {
            case 0:
                un unVar = this.f41882b;
                MessageObject messageObject3 = unVar.f44371p5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.f44385qa).k(false).j();
                }
                return true;
            case 1:
                return un.g1(this.f41882b);
            default:
                un unVar2 = this.f41882b;
                int i10 = unVar2.Kb;
                if (i10 == 1 && (messageObject2 = unVar2.B5) != null) {
                    unVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (unVar2.f44394r5 != null && i10 == 2 && (messageObject = unVar2.f44498z5) != null) {
                    unVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
