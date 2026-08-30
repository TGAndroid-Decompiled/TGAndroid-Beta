package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class c2 implements DialogInterface.OnDismissListener {
    public final int f29581a;
    public final Runnable f29582b;

    public c2(int i10, Runnable runnable) {
        this.f29581a = i10;
        this.f29582b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29581a) {
            case 0:
                Runnable runnable = this.f29582b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29582b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
