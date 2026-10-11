package org.telegram.ui.Components;

import android.view.View;
public final class w6 implements View.OnClickListener {
    public final int f32643a;
    public final Runnable f32644b;

    public w6(int i10, Runnable runnable) {
        this.f32643a = i10;
        this.f32644b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32643a) {
            case 0:
                this.f32644b.run();
                return;
            case 1:
                Runnable runnable = this.f32644b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f32644b.run();
                return;
        }
    }
}
