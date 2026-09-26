package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28723a;
    public final Runnable f28724b;

    public u6(int i10, Runnable runnable) {
        this.f28723a = i10;
        this.f28724b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28723a) {
            case 0:
                this.f28724b.run();
                return;
            case 1:
                Runnable runnable = this.f28724b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28724b.run();
                return;
        }
    }
}
