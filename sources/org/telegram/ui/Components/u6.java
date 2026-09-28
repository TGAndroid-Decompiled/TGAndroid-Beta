package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28752a;
    public final Runnable f28753b;

    public u6(int i10, Runnable runnable) {
        this.f28752a = i10;
        this.f28753b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28752a) {
            case 0:
                this.f28753b.run();
                return;
            case 1:
                Runnable runnable = this.f28753b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28753b.run();
                return;
        }
    }
}
