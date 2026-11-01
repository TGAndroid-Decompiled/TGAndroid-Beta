package org.telegram.ui.Components;

import android.view.View;
public final class k6 implements View.OnClickListener {
    public final int f27735a;
    public final Runnable f27736b;

    public k6(int i10, Runnable runnable) {
        this.f27735a = i10;
        this.f27736b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27735a) {
            case 0:
                this.f27736b.run();
                return;
            case 1:
                Runnable runnable = this.f27736b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27736b.run();
                return;
        }
    }
}
