package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class c2 implements DialogInterface.OnDismissListener {
    public final int f28862a;
    public final Runnable f28863b;

    public c2(int i10, Runnable runnable) {
        this.f28862a = i10;
        this.f28863b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28862a) {
            case 0:
                Runnable runnable = this.f28863b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f28863b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
