package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class oj0 implements Runnable {
    public final int f36397a;
    public final wj0 f36398b;

    public oj0(wj0 wj0Var, int i10) {
        this.f36397a = i10;
        this.f36398b = wj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36397a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36398b.f39468b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36398b.d.getEditText());
                return;
        }
    }
}
