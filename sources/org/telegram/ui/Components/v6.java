package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31163a;
    public final Runnable f31164b;

    public v6(int i10, Runnable runnable) {
        this.f31163a = i10;
        this.f31164b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31163a) {
            case 0:
                this.f31164b.run();
                return;
            case 1:
                Runnable runnable = this.f31164b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31164b.run();
                return;
        }
    }
}
