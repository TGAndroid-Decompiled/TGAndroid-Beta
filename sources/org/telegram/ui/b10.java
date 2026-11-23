package org.telegram.ui;

import android.content.DialogInterface;
public final class b10 implements DialogInterface.OnDismissListener {
    public final int f45693a;
    public final f40 f45694b;

    public b10(f40 f40Var, int i7) {
        this.f45693a = i7;
        this.f45694b = f40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45693a) {
            case 0:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (this.f45694b.f47508s2 && (T instanceof bn)) {
                    ((bn) T).wa(true, true);
                    return;
                }
                return;
            case 1:
                this.f45694b.dismiss();
                return;
            case 2:
                this.f45694b.D3 = null;
                return;
            default:
                this.f45694b.f47480m2 = null;
                return;
        }
    }
}
