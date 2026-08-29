package org.telegram.ui;

import android.content.DialogInterface;
public final class df0 implements DialogInterface.OnDismissListener {
    public final int f37536a;
    public final if0 f37537b;

    public df0(if0 if0Var, int i10) {
        this.f37536a = i10;
        this.f37537b = if0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37536a) {
            case 0:
                this.f37537b.f39249o0.finishFragment();
                return;
            default:
                this.f37537b.f39249o0.finishFragment();
                return;
        }
    }
}
