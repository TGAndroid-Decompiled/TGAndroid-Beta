package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class cf implements Runnable {
    public final int f36409a;
    public final eo f36410b;
    public final org.telegram.ui.Components.mn0 f36411c;
    public final String d;

    public cf(eo eoVar, org.telegram.ui.Components.mn0 mn0Var, String str, int i10) {
        this.f36409a = i10;
        this.f36410b = eoVar;
        this.f36411c = mn0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.zc a02;
        int i10;
        switch (this.f36409a) {
            case 0:
                this.f36411c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f36410b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f36411c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f36410b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f36411c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f36410b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f36411c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f36410b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.am.p(i10, a02);
    }
}
