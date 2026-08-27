package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class n51 implements Runnable {

    public final int f40671a;

    public final gh.r f40672b;

    public n51(gh.r rVar, int i10) {
        this.f40671a = i10;
        this.f40672b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f40671a) {
            case 0:
                AndroidUtilities.showKeyboard(((r41) this.f40672b.d).h);
                break;
            default:
                this.f40672b.requestFocus();
                break;
        }
    }
}
