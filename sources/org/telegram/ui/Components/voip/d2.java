package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f31820a;
    public final Runnable f31821b;

    public d2(int i10, Runnable runnable) {
        this.f31820a = i10;
        this.f31821b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31820a) {
            case 0:
                Runnable runnable = this.f31821b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f31821b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
