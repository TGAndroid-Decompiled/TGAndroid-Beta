package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class qe implements Runnable {
    public final int f37730a;
    public final xn f37731b;
    public final String f37732c;

    public qe(xn xnVar, String str, int i10) {
        this.f37730a = i10;
        this.f37731b = xnVar;
        this.f37732c = str;
    }

    @Override
    public final void run() {
        switch (this.f37730a) {
            case 0:
                xn.W0(this.f37731b, this.f37732c);
                return;
            case 1:
                xn.h1(this.f37731b, this.f37732c);
                return;
            case 2:
                l4.f(this.f37732c, r1.currentAccount, r1.U0, null, this.f37731b.f39968ba);
                return;
            case 3:
                xn xnVar = this.f37731b;
                String str = this.f37732c;
                if (str != null) {
                    xnVar.getClass();
                    if (str.length() != 0) {
                        xnVar.getMessagesController().sendBotStart(xnVar.f40009f, str);
                        return;
                    }
                }
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", xnVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f37731b.la(this.f37732c);
                return;
            case 5:
                this.f37731b.da(this.f37732c, false);
                return;
            case 6:
                Activity parentActivity = this.f37731b.getParentActivity();
                af.g.s(parentActivity, "tel:" + this.f37732c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f37732c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.f37731b));
                return;
            case 8:
                xn.u1(this.f37731b, this.f37732c);
                return;
            case 9:
                Activity parentActivity2 = this.f37731b.getParentActivity();
                af.g.s(parentActivity2, "tel:" + this.f37732c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f37732c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.f37731b));
                return;
            default:
                Activity parentActivity3 = this.f37731b.getParentActivity();
                af.g.s(parentActivity3, "https://fragment.com/username/" + this.f37732c);
                return;
        }
    }
}
