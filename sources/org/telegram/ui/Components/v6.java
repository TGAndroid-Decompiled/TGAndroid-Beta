package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31367a;
    public final Runnable f31368b;

    public v6(int i10, Runnable runnable) {
        this.f31367a = i10;
        this.f31368b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31367a) {
            case 0:
                this.f31368b.run();
                return;
            case 1:
                Runnable runnable = this.f31368b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31368b.run();
                return;
        }
    }
}
