package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class jl0 implements Runnable {
    public final int f29756a;
    public final ll0 f29757b;

    public jl0(ll0 ll0Var, int i9) {
        this.f29756a = i9;
        this.f29757b = ll0Var;
    }

    @Override
    public final void run() {
        switch (this.f29756a) {
            case 0:
                ll0 ll0Var = this.f29757b;
                ll0Var.getClass();
                AndroidUtilities.runOnUIThread(new jl0(ll0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jl0(this.f29757b, 3));
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
