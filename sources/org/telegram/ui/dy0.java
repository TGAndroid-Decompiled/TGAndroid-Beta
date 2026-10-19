package org.telegram.ui;

import android.view.View;
public final class dy0 implements View.OnClickListener {
    public final int f36457a;
    public final Runnable f36458b;

    public dy0(int i10, Runnable runnable) {
        this.f36457a = i10;
        this.f36458b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36457a) {
            case 0:
                this.f36458b.run();
                return;
            default:
                Runnable runnable = this.f36458b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
