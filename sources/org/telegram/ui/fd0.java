package org.telegram.ui;

import android.content.DialogInterface;
public final class fd0 implements DialogInterface.OnDismissListener {
    public final int f45687a;
    public final jd0 f45688b;

    public fd0(jd0 jd0Var, int i7) {
        this.f45687a = i7;
        this.f45688b = jd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45687a) {
            case 0:
                this.f45688b.f46985u0.finishFragment();
                return;
            default:
                this.f45688b.f46985u0.finishFragment();
                return;
        }
    }
}
