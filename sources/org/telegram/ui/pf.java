package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class pf implements View.OnLongClickListener {
    public final int f40140a;
    public final sn f40141b;

    public pf(sn snVar, int i10) {
        this.f40140a = i10;
        this.f40141b = snVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f40140a) {
            case 0:
                sn snVar = this.f40141b;
                MessageObject messageObject3 = snVar.f41210d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.f41226ea).k(false).j();
                }
                return true;
            case 1:
                return sn.W(this.f40141b);
            default:
                sn snVar2 = this.f40141b;
                int i10 = snVar2.ob;
                if (i10 == 1 && (messageObject2 = snVar2.p5) != null) {
                    snVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (snVar2.f41235f5 != null && i10 == 2 && (messageObject = snVar2.f41332n5) != null) {
                    snVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
