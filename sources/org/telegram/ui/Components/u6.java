package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28709a;
    public final Runnable f28710b;

    public u6(int i10, Runnable runnable) {
        this.f28709a = i10;
        this.f28710b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28709a) {
            case 0:
                this.f28710b.run();
                return;
            case 1:
                Runnable runnable = this.f28710b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28710b.run();
                return;
        }
    }
}
