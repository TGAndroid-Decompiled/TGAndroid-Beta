package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28773a;
    public final Runnable f28774b;

    public u6(int i10, Runnable runnable) {
        this.f28773a = i10;
        this.f28774b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28773a) {
            case 0:
                this.f28774b.run();
                return;
            case 1:
                Runnable runnable = this.f28774b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28774b.run();
                return;
        }
    }
}
