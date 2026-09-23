package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f28420a;
    public final Runnable f28421b;

    public u6(int i10, Runnable runnable) {
        this.f28420a = i10;
        this.f28421b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28420a) {
            case 0:
                this.f28421b.run();
                return;
            case 1:
                Runnable runnable = this.f28421b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28421b.run();
                return;
        }
    }
}
