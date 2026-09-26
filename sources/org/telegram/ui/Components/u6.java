package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28708a;
    public final Runnable f28709b;

    public u6(int i10, Runnable runnable) {
        this.f28708a = i10;
        this.f28709b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28708a) {
            case 0:
                this.f28709b.run();
                return;
            case 1:
                Runnable runnable = this.f28709b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28709b.run();
                return;
        }
    }
}
