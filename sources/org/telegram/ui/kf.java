package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class kf implements View.OnLongClickListener {
    public final int f39823a;
    public final qn f39824b;

    public kf(qn qnVar, int i9) {
        this.f39823a = i9;
        this.f39824b = qnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f39823a) {
            case 0:
                qn qnVar = this.f39824b;
                MessageObject messageObject3 = qnVar.Z4;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.f41848aa).k(false).j();
                }
                return true;
            case 1:
                return qn.R0(this.f39824b);
            default:
                qn qnVar2 = this.f39824b;
                int i9 = qnVar2.f41976kb;
                if (i9 == 1 && (messageObject2 = qnVar2.f41982l5) != null) {
                    qnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                } else if (qnVar2.f41857b5 != null && i9 == 2 && (messageObject = qnVar2.f41959j5) != null) {
                    qnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
