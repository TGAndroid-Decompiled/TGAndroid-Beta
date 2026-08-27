package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class qe implements Runnable {

    public final int f41641a;

    public final rn f41642b;

    public final org.telegram.ui.Components.ol0 f41643c;
    public final String d;

    public qe(rn rnVar, org.telegram.ui.Components.ol0 ol0Var, String str, int i10) {
        this.f41641a = i10;
        this.f41642b = rnVar;
        this.f41643c = ol0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.mc mcVarA0;
        int i10;
        switch (this.f41641a) {
            case 0:
                this.f41643c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                mcVarA0 = org.telegram.ui.Components.mc.a0(this.f41642b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f41643c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                mcVarA0 = org.telegram.ui.Components.mc.a0(this.f41642b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f41643c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                mcVarA0 = org.telegram.ui.Components.mc.a0(this.f41642b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.rl.m(i10, mcVarA0);
    }
}
