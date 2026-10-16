package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class a2 implements DialogInterface.OnDismissListener {
    public final int f29767a;
    public final Runnable f29768b;

    public a2(int i10, Runnable runnable) {
        this.f29767a = i10;
        this.f29768b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29767a) {
            case 0:
                Runnable runnable = this.f29768b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29768b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
