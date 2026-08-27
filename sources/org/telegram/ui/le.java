package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

public final class le implements Runnable {

    public final int f40066a;

    public final rn f40067b;

    public final String f40068c;

    public le(rn rnVar, String str, int i10) {
        this.f40066a = i10;
        this.f40067b = rnVar;
        this.f40068c = str;
    }

    @Override
    public final void run() {
        switch (this.f40066a) {
            case 0:
                rn.W0(this.f40067b, this.f40068c);
                break;
            case 1:
                rn.h1(this.f40067b, this.f40068c);
                break;
            case 2:
                rn rnVar = this.f40067b;
                m4.f(this.f40068c, rnVar.currentAccount, rnVar.T0, null, rnVar.f41983aa);
                break;
            case 3:
                rn rnVar2 = this.f40067b;
                String str = this.f40068c;
                if (str != null) {
                    rnVar2.getClass();
                    if (str.length() != 0) {
                        rnVar2.getMessagesController().sendBotStart(rnVar2.f42039f, str);
                    }
                }
                rnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", rnVar2.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.f40067b.la(this.f40068c);
                break;
            case 5:
                this.f40067b.da(this.f40068c, false);
                break;
            case 6:
                we.e.s(this.f40067b.getParentActivity(), "tel:" + this.f40068c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.f40068c);
                org.telegram.messenger.rl.m(R.string.PhoneCopied, org.telegram.ui.Components.mc.a0(this.f40067b));
                break;
            case 8:
                rn.u1(this.f40067b, this.f40068c);
                break;
            case 9:
                we.e.s(this.f40067b.getParentActivity(), "tel:" + this.f40068c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.f40068c);
                org.telegram.messenger.rl.m(R.string.PhoneCopied, org.telegram.ui.Components.mc.a0(this.f40067b));
                break;
            default:
                we.e.s(this.f40067b.getParentActivity(), "https://fragment.com/username/" + this.f40068c);
                break;
        }
    }
}
