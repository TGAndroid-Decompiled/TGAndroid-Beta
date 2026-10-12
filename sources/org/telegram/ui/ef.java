package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ef implements Runnable {
    public final int f35529a;
    public final fo f35530b;
    public final org.telegram.ui.Components.cn0 f35531c;
    public final String d;

    public ef(fo foVar, org.telegram.ui.Components.cn0 cn0Var, String str, int i10) {
        this.f35529a = i10;
        this.f35530b = foVar;
        this.f35531c = cn0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.zc a02;
        int i10;
        switch (this.f35529a) {
            case 0:
                this.f35531c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f35530b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f35531c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f35530b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f35531c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f35530b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f35531c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f35530b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.yh.o(i10, a02);
    }
}
