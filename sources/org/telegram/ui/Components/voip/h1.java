package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ri0;

public final class h1 implements Runnable {

    public final int f33603a;

    public final l1 f33604b;

    public final ri0 f33605c;

    public h1(l1 l1Var, ri0 ri0Var, int i10) {
        this.f33603a = i10;
        this.f33604b = l1Var;
        this.f33605c = ri0Var;
    }

    @Override
    public final void run() {
        switch (this.f33603a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h1(this.f33604b, this.f33605c, 1));
                break;
            default:
                this.f33604b.removeView(this.f33605c);
                break;
        }
    }
}
