package org.telegram.ui;

import android.content.DialogInterface;
public final class ad0 implements DialogInterface.OnDismissListener {
    public final int f45031a;
    public final ed0 f45032b;

    public ad0(ed0 ed0Var, int i7) {
        this.f45031a = i7;
        this.f45032b = ed0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45031a) {
            case 0:
                this.f45032b.f46749v0.finishFragment();
                return;
            default:
                this.f45032b.f46749v0.finishFragment();
                return;
        }
    }
}
