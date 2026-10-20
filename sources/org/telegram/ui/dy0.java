package org.telegram.ui;

import android.view.View;
public final class dy0 implements View.OnClickListener {
    public final int f36463a;
    public final Runnable f36464b;

    public dy0(int i10, Runnable runnable) {
        this.f36463a = i10;
        this.f36464b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36463a) {
            case 0:
                this.f36464b.run();
                return;
            default:
                Runnable runnable = this.f36464b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
