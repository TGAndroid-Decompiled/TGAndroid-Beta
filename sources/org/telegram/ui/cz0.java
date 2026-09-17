package org.telegram.ui;

import android.view.View;
public final class cz0 implements View.OnClickListener {
    public final int f32972a;
    public final Runnable f32973b;

    public cz0(int i10, Runnable runnable) {
        this.f32972a = i10;
        this.f32973b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32972a) {
            case 0:
                this.f32973b.run();
                return;
            default:
                Runnable runnable = this.f32973b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
