package org.telegram.ui.Components;

import android.view.View;
public final class w6 implements View.OnClickListener {
    public final int f32270a;
    public final Runnable f32271b;

    public w6(int i10, Runnable runnable) {
        this.f32270a = i10;
        this.f32271b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32270a) {
            case 0:
                this.f32271b.run();
                return;
            case 1:
                Runnable runnable = this.f32271b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f32271b.run();
                return;
        }
    }
}
