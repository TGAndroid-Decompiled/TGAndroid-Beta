package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class nf implements View.OnLongClickListener {
    public final int f39585a;
    public final qn f39586b;

    public nf(qn qnVar, int i10) {
        this.f39585a = i10;
        this.f39586b = qnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f39585a) {
            case 0:
                qn qnVar = this.f39586b;
                MessageObject messageObject3 = qnVar.f40660d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.f40676ea).k(false).j();
                }
                return true;
            case 1:
                return qn.W(this.f39586b);
            default:
                qn qnVar2 = this.f39586b;
                int i10 = qnVar2.ob;
                if (i10 == 1 && (messageObject2 = qnVar2.p5) != null) {
                    qnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (qnVar2.f40685f5 != null && i10 == 2 && (messageObject = qnVar2.f40782n5) != null) {
                    qnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
