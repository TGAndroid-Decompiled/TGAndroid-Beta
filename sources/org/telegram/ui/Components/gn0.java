package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class gn0 implements Runnable {
    public final int f26784a;
    public final in0 f26785b;

    public gn0(in0 in0Var, int i10) {
        this.f26784a = i10;
        this.f26785b = in0Var;
    }

    @Override
    public final void run() {
        switch (this.f26784a) {
            case 0:
                in0 in0Var = this.f26785b;
                in0Var.getClass();
                AndroidUtilities.runOnUIThread(new gn0(in0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gn0(this.f26785b, 3));
                return;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
