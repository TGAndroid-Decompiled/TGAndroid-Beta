package org.telegram.ui.Components;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f32877a;
    public final Runnable f32878b;

    public t6(int i10, Runnable runnable) {
        this.f32877a = i10;
        this.f32878b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32877a) {
            case 0:
                this.f32878b.run();
                return;
            case 1:
                Runnable runnable = this.f32878b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f32878b.run();
                return;
        }
    }
}
