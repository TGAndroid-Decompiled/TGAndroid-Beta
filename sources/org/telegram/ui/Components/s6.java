package org.telegram.ui.Components;

import android.view.View;
public final class s6 implements View.OnClickListener {
    public final int f39501a;
    public final Runnable f39502b;

    public s6(int i7, Runnable runnable) {
        this.f39501a = i7;
        this.f39502b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39501a) {
            case 0:
                this.f39502b.run();
                return;
            case 1:
                Runnable runnable = this.f39502b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39502b.run();
                return;
        }
    }
}
