package org.telegram.ui;

import android.content.DialogInterface;
public final class a10 implements DialogInterface.OnDismissListener {
    public final int f45544a;
    public final e40 f45545b;

    public a10(e40 e40Var, int i7) {
        this.f45544a = i7;
        this.f45545b = e40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45544a) {
            case 0:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (this.f45545b.f47396s2 && (T instanceof bn)) {
                    ((bn) T).wa(true, true);
                    return;
                }
                return;
            case 1:
                this.f45545b.dismiss();
                return;
            case 2:
                this.f45545b.D3 = null;
                return;
            default:
                this.f45545b.f47368m2 = null;
                return;
        }
    }
}
