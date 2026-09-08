package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31167a;
    public final Runnable f31168b;

    public v6(int i10, Runnable runnable) {
        this.f31167a = i10;
        this.f31168b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31167a) {
            case 0:
                this.f31168b.run();
                return;
            case 1:
                Runnable runnable = this.f31168b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31168b.run();
                return;
        }
    }
}
