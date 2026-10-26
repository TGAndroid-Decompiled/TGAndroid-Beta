package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class s1 implements DialogInterface.OnDismissListener {
    public final int f23068a;
    public final Object f23069b;

    public s1(Object obj, int i10) {
        this.f23068a = i10;
        this.f23069b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f23068a) {
            case 0:
                ((e2) this.f23069b).K = null;
                return;
            default:
                ((Runnable) this.f23069b).run();
                return;
        }
    }
}
