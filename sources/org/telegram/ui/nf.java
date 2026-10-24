package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class nf implements View.OnLongClickListener {
    public final int f39814a;
    public final sn f39815b;

    public nf(sn snVar, int i10) {
        this.f39814a = i10;
        this.f39815b = snVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f39814a) {
            case 0:
                sn snVar = this.f39815b;
                MessageObject messageObject3 = snVar.p5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(snVar.getParentActivity()), snVar.f41651qa).k(false).j();
                }
                return true;
            case 1:
                return sn.W(this.f39815b);
            default:
                sn snVar2 = this.f39815b;
                int i10 = snVar2.Bb;
                if (i10 == 1 && (messageObject2 = snVar2.B5) != null) {
                    snVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (snVar2.f41660r5 != null && i10 == 2 && (messageObject = snVar2.f41764z5) != null) {
                    snVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
