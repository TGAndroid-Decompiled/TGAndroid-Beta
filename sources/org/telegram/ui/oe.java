package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class oe implements Runnable {
    public final int f41098a;
    public final tn f41099b;
    public final org.telegram.ui.Components.yl0 f41100c;
    public final String d;

    public oe(tn tnVar, org.telegram.ui.Components.yl0 yl0Var, String str, int i10) {
        this.f41098a = i10;
        this.f41099b = tnVar;
        this.f41100c = yl0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.tc a02;
        int i10;
        switch (this.f41098a) {
            case 0:
                this.f41100c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.tc.a0(this.f41099b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f41100c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.tc.a0(this.f41099b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f41100c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.tc.a0(this.f41099b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        b.n(i10, a02);
    }
}
