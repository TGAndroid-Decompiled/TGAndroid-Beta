package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class a2 implements DialogInterface.OnDismissListener {
    public final int f30098a;
    public final Runnable f30099b;

    public a2(int i10, Runnable runnable) {
        this.f30098a = i10;
        this.f30099b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f30098a) {
            case 0:
                Runnable runnable = this.f30099b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f30099b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
