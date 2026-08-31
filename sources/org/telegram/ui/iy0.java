package org.telegram.ui;

import android.view.View;
public final class iy0 implements View.OnClickListener {
    public final int f37956a;
    public final Runnable f37957b;

    public iy0(int i10, Runnable runnable) {
        this.f37956a = i10;
        this.f37957b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37956a) {
            case 0:
                this.f37957b.run();
                return;
            default:
                Runnable runnable = this.f37957b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
