package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f29229a;
    public final Runnable f29230b;

    public d2(int i10, Runnable runnable) {
        this.f29229a = i10;
        this.f29230b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29229a) {
            case 0:
                Runnable runnable = this.f29230b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29230b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
