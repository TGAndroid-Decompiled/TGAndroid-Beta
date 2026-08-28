package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class le implements Runnable {
    public final int f40116a;
    public final qn f40117b;
    public final String f40118c;

    public le(qn qnVar, String str, int i9) {
        this.f40116a = i9;
        this.f40117b = qnVar;
        this.f40118c = str;
    }

    @Override
    public final void run() {
        switch (this.f40116a) {
            case 0:
                qn.W0(this.f40117b, this.f40118c);
                return;
            case 1:
                qn.h1(this.f40117b, this.f40118c);
                return;
            case 2:
                l4.f(this.f40118c, r1.currentAccount, r1.T0, null, this.f40117b.f41848aa);
                return;
            case 3:
                qn qnVar = this.f40117b;
                String str = this.f40118c;
                if (str != null) {
                    qnVar.getClass();
                    if (str.length() != 0) {
                        qnVar.getMessagesController().sendBotStart(qnVar.f41903f, str);
                        return;
                    }
                }
                qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", qnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f40117b.la(this.f40118c);
                return;
            case 5:
                this.f40117b.da(this.f40118c, false);
                return;
            case 6:
                Activity parentActivity = this.f40117b.getParentActivity();
                ve.e.s(parentActivity, "tel:" + this.f40118c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f40118c);
                org.telegram.messenger.ll.o(R.string.PhoneCopied, org.telegram.ui.Components.oc.a0(this.f40117b));
                return;
            case 8:
                qn.u1(this.f40117b, this.f40118c);
                return;
            case 9:
                Activity parentActivity2 = this.f40117b.getParentActivity();
                ve.e.s(parentActivity2, "tel:" + this.f40118c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f40118c);
                org.telegram.messenger.ll.o(R.string.PhoneCopied, org.telegram.ui.Components.oc.a0(this.f40117b));
                return;
            default:
                Activity parentActivity3 = this.f40117b.getParentActivity();
                ve.e.s(parentActivity3, "https://fragment.com/username/" + this.f40118c);
                return;
        }
    }
}
