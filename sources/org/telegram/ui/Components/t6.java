package org.telegram.ui.Components;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f39792a;
    public final Runnable f39793b;

    public t6(int i7, Runnable runnable) {
        this.f39792a = i7;
        this.f39793b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39792a) {
            case 0:
                this.f39793b.run();
                return;
            case 1:
                Runnable runnable = this.f39793b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39793b.run();
                return;
        }
    }
}
