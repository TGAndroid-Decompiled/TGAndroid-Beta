package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f32044a;
    public final Runnable f32045b;

    public r0(int i9, Runnable runnable) {
        this.f32044a = i9;
        this.f32045b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32044a) {
            case 0:
                this.f32045b.run();
                return;
            case 1:
                Runnable runnable = this.f32045b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f32045b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f32045b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
