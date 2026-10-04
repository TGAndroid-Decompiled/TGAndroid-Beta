package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class af implements Runnable {
    public final int f34800a;
    public final yn f34801b;
    public final org.telegram.ui.Components.sm0 f34802c;
    public final String d;

    public af(yn ynVar, org.telegram.ui.Components.sm0 sm0Var, String str, int i10) {
        this.f34800a = i10;
        this.f34801b = ynVar;
        this.f34802c = sm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.yc a02;
        int i10;
        switch (this.f34800a) {
            case 0:
                this.f34802c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f34801b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f34802c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f34801b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f34802c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f34801b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.ok.o(i10, a02);
    }
}
