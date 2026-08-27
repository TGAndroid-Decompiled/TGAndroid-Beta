package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class r0 implements DialogInterface.OnDismissListener {

    public final int f32015a;

    public final Runnable f32016b;

    public r0(int i10, Runnable runnable) {
        this.f32015a = i10;
        this.f32016b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32015a) {
            case 0:
                this.f32016b.run();
                break;
            case 1:
                Runnable runnable = this.f32016b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 2:
                Runnable runnable2 = this.f32016b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            default:
                Runnable runnable3 = this.f32016b;
                if (runnable3 != null) {
                    runnable3.run();
                }
                break;
        }
    }
}
