package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f31300a;
    public final Runnable f31301b;

    public u6(int i10, Runnable runnable) {
        this.f31300a = i10;
        this.f31301b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31300a) {
            case 0:
                this.f31301b.run();
                return;
            case 1:
                Runnable runnable = this.f31301b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31301b.run();
                return;
        }
    }
}
