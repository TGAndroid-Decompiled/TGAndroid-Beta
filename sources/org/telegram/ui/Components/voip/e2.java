package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class e2 implements DialogInterface.OnDismissListener {
    public final int f33675a;
    public final Runnable f33676b;

    public e2(int i10, Runnable runnable) {
        this.f33675a = i10;
        this.f33676b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f33675a) {
            case 0:
                Runnable runnable = this.f33676b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f33676b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
