package org.telegram.ui;

import android.view.View;
public final class dz0 implements View.OnClickListener {
    public final int f31996a;
    public final Runnable f31997b;

    public dz0(int i10, Runnable runnable) {
        this.f31996a = i10;
        this.f31997b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31996a) {
            case 0:
                this.f31997b.run();
                return;
            default:
                Runnable runnable = this.f31997b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
