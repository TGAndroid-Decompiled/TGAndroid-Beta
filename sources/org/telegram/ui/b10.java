package org.telegram.ui;

import android.content.DialogInterface;
public final class b10 implements DialogInterface.OnDismissListener {
    public final int f45748a;
    public final f40 f45749b;

    public b10(f40 f40Var, int i7) {
        this.f45748a = i7;
        this.f45749b = f40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45748a) {
            case 0:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (this.f45749b.f47546s2 && (T instanceof bn)) {
                    ((bn) T).wa(true, true);
                    return;
                }
                return;
            case 1:
                this.f45749b.dismiss();
                return;
            case 2:
                this.f45749b.D3 = null;
                return;
            default:
                this.f45749b.f47518m2 = null;
                return;
        }
    }
}
