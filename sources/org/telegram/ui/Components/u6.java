package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28695a;
    public final Runnable f28696b;

    public u6(int i10, Runnable runnable) {
        this.f28695a = i10;
        this.f28696b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28695a) {
            case 0:
                this.f28696b.run();
                return;
            case 1:
                Runnable runnable = this.f28696b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28696b.run();
                return;
        }
    }
}
