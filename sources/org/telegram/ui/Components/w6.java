package org.telegram.ui.Components;

import android.view.View;
public final class w6 implements View.OnClickListener {
    public final int f32559a;
    public final Runnable f32560b;

    public w6(int i10, Runnable runnable) {
        this.f32559a = i10;
        this.f32560b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32559a) {
            case 0:
                this.f32560b.run();
                return;
            case 1:
                Runnable runnable = this.f32560b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f32560b.run();
                return;
        }
    }
}
