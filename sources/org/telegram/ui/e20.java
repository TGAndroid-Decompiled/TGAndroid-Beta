package org.telegram.ui;

import android.content.DialogInterface;
public final class e20 implements DialogInterface.OnDismissListener {
    public final int f37795a;
    public final o50 f37796b;

    public e20(o50 o50Var, int i9) {
        this.f37795a = i9;
        this.f37796b = o50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37795a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (this.f37796b.f40960t0 && (U instanceof qn)) {
                    ((qn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f37796b.dismiss();
                return;
            case 2:
                this.f37796b.A1 = null;
                return;
            default:
                this.f37796b.f40934n0 = null;
                return;
        }
    }
}
