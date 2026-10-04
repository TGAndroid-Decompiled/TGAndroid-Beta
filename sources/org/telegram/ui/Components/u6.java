package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f31306a;
    public final Runnable f31307b;

    public u6(int i10, Runnable runnable) {
        this.f31306a = i10;
        this.f31307b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31306a) {
            case 0:
                this.f31307b.run();
                return;
            case 1:
                Runnable runnable = this.f31307b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31307b.run();
                return;
        }
    }
}
