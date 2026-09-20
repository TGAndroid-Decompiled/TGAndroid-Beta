package org.telegram.ui.Components;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f28301a;
    public final Runnable f28302b;

    public t6(int i10, Runnable runnable) {
        this.f28301a = i10;
        this.f28302b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28301a) {
            case 0:
                this.f28302b.run();
                return;
            case 1:
                Runnable runnable = this.f28302b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28302b.run();
                return;
        }
    }
}
