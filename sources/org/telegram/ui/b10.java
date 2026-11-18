package org.telegram.ui;

import android.content.DialogInterface;
public final class b10 implements DialogInterface.OnDismissListener {
    public final int f45709a;
    public final f40 f45710b;

    public b10(f40 f40Var, int i7) {
        this.f45709a = i7;
        this.f45710b = f40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45709a) {
            case 0:
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (this.f45710b.f47474s2 && (T instanceof bn)) {
                    ((bn) T).wa(true, true);
                    return;
                }
                return;
            case 1:
                this.f45710b.dismiss();
                return;
            case 2:
                this.f45710b.D3 = null;
                return;
            default:
                this.f45710b.f47446m2 = null;
                return;
        }
    }
}
