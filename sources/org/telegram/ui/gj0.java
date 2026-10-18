package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gj0 implements Runnable {
    public final int f37194a;
    public final oj0 f37195b;

    public gj0(oj0 oj0Var, int i10) {
        this.f37194a = i10;
        this.f37195b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37194a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37195b.f39808b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37195b.d.getEditText());
                return;
        }
    }
}
