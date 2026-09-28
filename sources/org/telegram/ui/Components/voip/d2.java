package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f29232a;
    public final Runnable f29233b;

    public d2(int i10, Runnable runnable) {
        this.f29232a = i10;
        this.f29233b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29232a) {
            case 0:
                Runnable runnable = this.f29233b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29233b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
