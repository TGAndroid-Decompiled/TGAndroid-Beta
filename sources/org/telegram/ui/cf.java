package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class cf implements Runnable {
    public final int f36411a;
    public final eo f36412b;
    public final org.telegram.ui.Components.mn0 f36413c;
    public final String d;

    public cf(eo eoVar, org.telegram.ui.Components.mn0 mn0Var, String str, int i10) {
        this.f36411a = i10;
        this.f36412b = eoVar;
        this.f36413c = mn0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.zc a02;
        int i10;
        switch (this.f36411a) {
            case 0:
                this.f36413c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f36412b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f36413c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f36412b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f36413c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f36412b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f36413c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.zc.a0(this.f36412b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.am.p(i10, a02);
    }
}
