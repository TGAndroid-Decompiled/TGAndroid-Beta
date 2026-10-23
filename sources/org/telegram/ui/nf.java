package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class nf implements View.OnLongClickListener {
    public final int f39586a;
    public final qn f39587b;

    public nf(qn qnVar, int i10) {
        this.f39586a = i10;
        this.f39587b = qnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f39586a) {
            case 0:
                qn qnVar = this.f39587b;
                MessageObject messageObject3 = qnVar.f40661d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.f40677ea).k(false).j();
                }
                return true;
            case 1:
                return qn.W(this.f39587b);
            default:
                qn qnVar2 = this.f39587b;
                int i10 = qnVar2.ob;
                if (i10 == 1 && (messageObject2 = qnVar2.p5) != null) {
                    qnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (qnVar2.f40686f5 != null && i10 == 2 && (messageObject = qnVar2.f40783n5) != null) {
                    qnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
