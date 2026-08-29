package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class je implements Runnable {
    public final int f39521a;
    public final tn f39522b;
    public final String f39523c;

    public je(tn tnVar, String str, int i10) {
        this.f39521a = i10;
        this.f39522b = tnVar;
        this.f39523c = str;
    }

    @Override
    public final void run() {
        switch (this.f39521a) {
            case 0:
                tn.W0(this.f39522b, this.f39523c);
                return;
            case 1:
                tn.h1(this.f39522b, this.f39523c);
                return;
            case 2:
                m4.f(this.f39523c, r1.currentAccount, r1.T0, null, this.f39522b.f42746aa);
                return;
            case 3:
                tn tnVar = this.f39522b;
                String str = this.f39523c;
                if (str != null) {
                    tnVar.getClass();
                    if (str.length() != 0) {
                        tnVar.getMessagesController().sendBotStart(tnVar.f42801f, str);
                        return;
                    }
                }
                tnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", tnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f39522b.la(this.f39523c);
                return;
            case 5:
                this.f39522b.da(this.f39523c, false);
                return;
            case 6:
                Activity parentActivity = this.f39522b.getParentActivity();
                ye.d.s(parentActivity, "tel:" + this.f39523c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f39523c);
                b.n(R.string.PhoneCopied, org.telegram.ui.Components.tc.a0(this.f39522b));
                return;
            case 8:
                tn.u1(this.f39522b, this.f39523c);
                return;
            case 9:
                Activity parentActivity2 = this.f39522b.getParentActivity();
                ye.d.s(parentActivity2, "tel:" + this.f39523c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f39523c);
                b.n(R.string.PhoneCopied, org.telegram.ui.Components.tc.a0(this.f39522b));
                return;
            default:
                Activity parentActivity3 = this.f39522b.getParentActivity();
                ye.d.s(parentActivity3, "https://fragment.com/username/" + this.f39523c);
                return;
        }
    }
}
