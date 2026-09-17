package org.telegram.ui;

import android.view.View;
public final class bz0 implements View.OnClickListener {
    public final int f34947a;
    public final Runnable f34948b;

    public bz0(int i10, Runnable runnable) {
        this.f34947a = i10;
        this.f34948b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34947a) {
            case 0:
                this.f34948b.run();
                return;
            default:
                Runnable runnable = this.f34948b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
