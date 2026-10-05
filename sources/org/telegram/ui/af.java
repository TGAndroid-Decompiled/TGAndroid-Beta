package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class af implements Runnable {
    public final int f34861a;
    public final yn f34862b;
    public final org.telegram.ui.Components.sm0 f34863c;
    public final String d;

    public af(yn ynVar, org.telegram.ui.Components.sm0 sm0Var, String str, int i10) {
        this.f34861a = i10;
        this.f34862b = ynVar;
        this.f34863c = sm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.yc a02;
        int i10;
        switch (this.f34861a) {
            case 0:
                this.f34863c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f34862b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f34863c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f34862b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f34863c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f34862b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.bi.n(i10, a02);
    }
}
