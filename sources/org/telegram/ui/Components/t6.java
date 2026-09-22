package org.telegram.ui.Components;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f28405a;
    public final Runnable f28406b;

    public t6(int i10, Runnable runnable) {
        this.f28405a = i10;
        this.f28406b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28405a) {
            case 0:
                this.f28406b.run();
                return;
            case 1:
                Runnable runnable = this.f28406b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28406b.run();
                return;
        }
    }
}
