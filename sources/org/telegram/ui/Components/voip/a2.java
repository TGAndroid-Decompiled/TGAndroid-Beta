package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class a2 implements DialogInterface.OnDismissListener {
    public final int f31398a;
    public final Runnable f31399b;

    public a2(int i10, Runnable runnable) {
        this.f31398a = i10;
        this.f31399b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31398a) {
            case 0:
                Runnable runnable = this.f31399b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f31399b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
