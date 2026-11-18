package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class v0 implements DialogInterface.OnDismissListener {
    public final int f40459a;
    public final Runnable f40460b;

    public v0(int i7, Runnable runnable) {
        this.f40459a = i7;
        this.f40460b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40459a) {
            case 0:
                Runnable runnable = this.f40460b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f40460b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f40460b.run();
                return;
            default:
                Runnable runnable3 = this.f40460b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
