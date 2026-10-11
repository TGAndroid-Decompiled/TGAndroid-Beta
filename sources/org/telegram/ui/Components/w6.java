package org.telegram.ui.Components;

import android.view.View;
public final class w6 implements View.OnClickListener {
    public final int f32588a;
    public final Runnable f32589b;

    public w6(int i10, Runnable runnable) {
        this.f32588a = i10;
        this.f32589b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32588a) {
            case 0:
                this.f32589b.run();
                return;
            case 1:
                Runnable runnable = this.f32589b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f32589b.run();
                return;
        }
    }
}
