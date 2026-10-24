package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ij0 implements Runnable {
    public final int f38317a;
    public final qj0 f38318b;

    public ij0(qj0 qj0Var, int i10) {
        this.f38317a = i10;
        this.f38318b = qj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38317a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38318b.f40848b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f38318b.f40850c.getEditText());
                return;
        }
    }
}
