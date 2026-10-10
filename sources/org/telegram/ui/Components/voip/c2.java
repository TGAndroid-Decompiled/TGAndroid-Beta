package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class c2 implements DialogInterface.OnDismissListener {
    public final int f31939a;
    public final Runnable f31940b;

    public c2(int i10, Runnable runnable) {
        this.f31939a = i10;
        this.f31940b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31939a) {
            case 0:
                Runnable runnable = this.f31940b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f31940b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
