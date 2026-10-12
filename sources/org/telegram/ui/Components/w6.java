package org.telegram.ui.Components;

import android.view.View;
public final class w6 implements View.OnClickListener {
    public final int f32284a;
    public final Runnable f32285b;

    public w6(int i10, Runnable runnable) {
        this.f32284a = i10;
        this.f32285b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32284a) {
            case 0:
                this.f32285b.run();
                return;
            case 1:
                Runnable runnable = this.f32285b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f32285b.run();
                return;
        }
    }
}
