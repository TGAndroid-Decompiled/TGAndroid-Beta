package org.telegram.ui;

import android.view.View;
public final class bz0 implements View.OnClickListener {
    public final int f34946a;
    public final Runnable f34947b;

    public bz0(int i10, Runnable runnable) {
        this.f34946a = i10;
        this.f34947b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34946a) {
            case 0:
                this.f34947b.run();
                return;
            default:
                Runnable runnable = this.f34947b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
