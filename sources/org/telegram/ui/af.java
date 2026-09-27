package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class af implements Runnable {
    public final int f32060a;
    public final xn f32061b;
    public final org.telegram.ui.Components.om0 f32062c;
    public final String d;

    public af(xn xnVar, org.telegram.ui.Components.om0 om0Var, String str, int i10) {
        this.f32060a = i10;
        this.f32061b = xnVar;
        this.f32062c = om0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f32060a) {
            case 0:
                this.f32062c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f32061b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f32062c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f32061b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f32062c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f32061b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.qk.o(i10, a02);
    }
}
