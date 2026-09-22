package org.telegram.ui;

import android.view.View;
public final class az0 implements View.OnClickListener {
    public final int f32240a;
    public final Runnable f32241b;

    public az0(int i10, Runnable runnable) {
        this.f32240a = i10;
        this.f32241b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32240a) {
            case 0:
                this.f32241b.run();
                return;
            default:
                Runnable runnable = this.f32241b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
