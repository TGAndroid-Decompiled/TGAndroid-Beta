package org.telegram.ui;

import android.view.View;
public final class az0 implements View.OnClickListener {
    public final int f32222a;
    public final Runnable f32223b;

    public az0(int i10, Runnable runnable) {
        this.f32222a = i10;
        this.f32223b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32222a) {
            case 0:
                this.f32223b.run();
                return;
            default:
                Runnable runnable = this.f32223b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
