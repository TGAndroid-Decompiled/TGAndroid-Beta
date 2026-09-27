package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28812a;
    public final Runnable f28813b;

    public u6(int i10, Runnable runnable) {
        this.f28812a = i10;
        this.f28813b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28812a) {
            case 0:
                this.f28813b.run();
                return;
            case 1:
                Runnable runnable = this.f28813b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28813b.run();
                return;
        }
    }
}
