package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fj0 implements Runnable {
    public final int f38302a;
    public final nj0 f38303b;

    public fj0(nj0 nj0Var, int i9) {
        this.f38302a = i9;
        this.f38303b = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38302a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38303b.f40747b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f38303b.d.getEditText());
                return;
        }
    }
}
