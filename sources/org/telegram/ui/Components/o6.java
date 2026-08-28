package org.telegram.ui.Components;

import android.view.View;
public final class o6 implements View.OnClickListener {
    public final int f31302a;
    public final Runnable f31303b;

    public o6(int i9, Runnable runnable) {
        this.f31302a = i9;
        this.f31303b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31302a) {
            case 0:
                this.f31303b.run();
                return;
            case 1:
                Runnable runnable = this.f31303b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31303b.run();
                return;
        }
    }
}
