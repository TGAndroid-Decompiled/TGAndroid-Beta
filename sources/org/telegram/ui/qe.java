package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class qe implements Runnable {
    public final int f40444a;
    public final xn f40445b;
    public final String f40446c;

    public qe(xn xnVar, String str, int i10) {
        this.f40444a = i10;
        this.f40445b = xnVar;
        this.f40446c = str;
    }

    @Override
    public final void run() {
        switch (this.f40444a) {
            case 0:
                xn.W0(this.f40445b, this.f40446c);
                return;
            case 1:
                xn.h1(this.f40445b, this.f40446c);
                return;
            case 2:
                l4.f(this.f40446c, r1.currentAccount, r1.U0, null, this.f40445b.f43114ba);
                return;
            case 3:
                xn xnVar = this.f40445b;
                String str = this.f40446c;
                if (str != null) {
                    xnVar.getClass();
                    if (str.length() != 0) {
                        xnVar.getMessagesController().sendBotStart(xnVar.f43156f, str);
                        return;
                    }
                }
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", xnVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f40445b.la(this.f40446c);
                return;
            case 5:
                this.f40445b.da(this.f40446c, false);
                return;
            case 6:
                Activity parentActivity = this.f40445b.getParentActivity();
                af.g.s(parentActivity, "tel:" + this.f40446c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f40446c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.f40445b));
                return;
            case 8:
                xn.u1(this.f40445b, this.f40446c);
                return;
            case 9:
                Activity parentActivity2 = this.f40445b.getParentActivity();
                af.g.s(parentActivity2, "tel:" + this.f40446c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f40446c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.f40445b));
                return;
            default:
                Activity parentActivity3 = this.f40445b.getParentActivity();
                af.g.s(parentActivity3, "https://fragment.com/username/" + this.f40446c);
                return;
        }
    }
}
