package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class qe implements Runnable {
    public final int f41768a;
    public final qn f41769b;
    public final org.telegram.ui.Components.ll0 f41770c;
    public final String d;

    public qe(qn qnVar, org.telegram.ui.Components.ll0 ll0Var, String str, int i9) {
        this.f41768a = i9;
        this.f41769b = qnVar;
        this.f41770c = ll0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.oc a02;
        int i9;
        switch (this.f41768a) {
            case 0:
                this.f41770c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.oc.a0(this.f41769b);
                i9 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f41770c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.oc.a0(this.f41769b);
                i9 = R.string.UsernameCopied;
                break;
            default:
                this.f41770c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.oc.a0(this.f41769b);
                i9 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.ll.o(i9, a02);
    }
}
