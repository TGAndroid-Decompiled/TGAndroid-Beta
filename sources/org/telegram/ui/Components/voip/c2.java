package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class c2 implements DialogInterface.OnDismissListener {
    public final int f29294a;
    public final Runnable f29295b;

    public c2(int i10, Runnable runnable) {
        this.f29294a = i10;
        this.f29295b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29294a) {
            case 0:
                Runnable runnable = this.f29295b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29295b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
