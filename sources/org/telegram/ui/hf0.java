package org.telegram.ui;

import android.content.DialogInterface;
public final class hf0 implements DialogInterface.OnDismissListener {
    public final int f37839a;
    public final mf0 f37840b;

    public hf0(mf0 mf0Var, int i10) {
        this.f37839a = i10;
        this.f37840b = mf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37839a) {
            case 0:
                this.f37840b.f39562u0.finishFragment();
                return;
            default:
                this.f37840b.f39562u0.finishFragment();
                return;
        }
    }
}
