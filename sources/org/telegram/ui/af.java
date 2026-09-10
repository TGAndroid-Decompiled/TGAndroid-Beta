package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class af implements Runnable {
    public final int f30983a;
    public final eo f30984b;
    public final org.telegram.ui.Components.km0 f30985c;
    public final String d;

    public af(eo eoVar, org.telegram.ui.Components.km0 km0Var, String str, int i10) {
        this.f30983a = i10;
        this.f30984b = eoVar;
        this.f30985c = km0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wc a02;
        int i10;
        switch (this.f30983a) {
            case 0:
                this.f30985c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.wc.a0(this.f30984b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f30985c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.wc.a0(this.f30984b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f30985c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.wc.a0(this.f30984b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.em.o(i10, a02);
    }
}
