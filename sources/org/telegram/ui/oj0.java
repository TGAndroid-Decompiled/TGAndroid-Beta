package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class oj0 implements Runnable {
    public final int f36256a;
    public final wj0 f36257b;

    public oj0(wj0 wj0Var, int i10) {
        this.f36256a = i10;
        this.f36257b = wj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36256a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36257b.f39378b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36257b.d.getEditText());
                return;
        }
    }
}
