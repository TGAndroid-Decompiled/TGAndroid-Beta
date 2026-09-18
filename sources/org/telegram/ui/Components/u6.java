package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28616a;
    public final Runnable f28617b;

    public u6(int i10, Runnable runnable) {
        this.f28616a = i10;
        this.f28617b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28616a) {
            case 0:
                this.f28617b.run();
                return;
            case 1:
                Runnable runnable = this.f28617b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28617b.run();
                return;
        }
    }
}
