package org.telegram.ui;

import android.view.View;
public final class bz0 implements View.OnClickListener {
    public final int f32592a;
    public final Runnable f32593b;

    public bz0(int i10, Runnable runnable) {
        this.f32592a = i10;
        this.f32593b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32592a) {
            case 0:
                this.f32593b.run();
                return;
            default:
                Runnable runnable = this.f32593b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
