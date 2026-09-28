package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class oj0 implements Runnable {
    public final int f36257a;
    public final wj0 f36258b;

    public oj0(wj0 wj0Var, int i10) {
        this.f36257a = i10;
        this.f36258b = wj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36257a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36258b.f39379b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36258b.d.getEditText());
                return;
        }
    }
}
