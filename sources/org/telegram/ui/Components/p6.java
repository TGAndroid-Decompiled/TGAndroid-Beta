package org.telegram.ui.Components;

import android.view.View;
public final class p6 implements View.OnClickListener {
    public final int f27743a;
    public final Runnable f27744b;

    public p6(int i10, Runnable runnable) {
        this.f27743a = i10;
        this.f27744b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27743a) {
            case 0:
                this.f27744b.run();
                return;
            case 1:
                Runnable runnable = this.f27744b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27744b.run();
                return;
        }
    }
}
