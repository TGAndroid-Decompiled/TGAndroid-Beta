package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class a2 implements DialogInterface.OnDismissListener {
    public final int f31397a;
    public final Runnable f31398b;

    public a2(int i10, Runnable runnable) {
        this.f31397a = i10;
        this.f31398b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31397a) {
            case 0:
                Runnable runnable = this.f31398b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f31398b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
