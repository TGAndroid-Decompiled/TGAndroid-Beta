package org.telegram.ui;

import android.view.View;
public final class bz0 implements View.OnClickListener {
    public final int f34974a;
    public final Runnable f34975b;

    public bz0(int i10, Runnable runnable) {
        this.f34974a = i10;
        this.f34975b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34974a) {
            case 0:
                this.f34975b.run();
                return;
            default:
                Runnable runnable = this.f34975b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
