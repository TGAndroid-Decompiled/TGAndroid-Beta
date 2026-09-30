package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28751a;
    public final Runnable f28752b;

    public u6(int i10, Runnable runnable) {
        this.f28751a = i10;
        this.f28752b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28751a) {
            case 0:
                this.f28752b.run();
                return;
            case 1:
                Runnable runnable = this.f28752b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28752b.run();
                return;
        }
    }
}
