package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m0 implements DialogInterface.OnDismissListener {
    public final int f28313a;
    public final Runnable f28314b;

    public m0(int i10, Runnable runnable) {
        this.f28313a = i10;
        this.f28314b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28313a) {
            case 0:
                Runnable runnable = this.f28314b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f28314b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable3 = this.f28314b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            default:
                this.f28314b.run();
                return;
        }
    }
}
