package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mf implements View.OnLongClickListener {
    public final int f41428a;
    public final wn f41429b;

    public mf(wn wnVar, int i10) {
        this.f41428a = i10;
        this.f41429b = wnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f41428a) {
            case 0:
                wn wnVar = this.f41429b;
                MessageObject messageObject3 = wnVar.f45291t5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.f45309ua).k(false).j();
                }
                return true;
            case 1:
                return wn.a0(this.f41429b);
            default:
                wn wnVar2 = this.f41429b;
                int i10 = wnVar2.Ob;
                if (i10 == 1 && (messageObject2 = wnVar2.F5) != null) {
                    wnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (wnVar2.f45317v5 != null && i10 == 2 && (messageObject = wnVar2.D5) != null) {
                    wnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
