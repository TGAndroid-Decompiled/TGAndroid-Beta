package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class b2 implements DialogInterface.OnDismissListener {
    public final int f33446a;
    public final Runnable f33447b;

    public b2(int i9, Runnable runnable) {
        this.f33446a = i9;
        this.f33447b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f33446a) {
            case 0:
                Runnable runnable = this.f33447b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f33447b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
