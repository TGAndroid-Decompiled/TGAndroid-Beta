package org.telegram.ui;

import android.view.View;
public final class gy0 implements View.OnClickListener {
    public final int f37689a;
    public final Runnable f37690b;

    public gy0(int i10, Runnable runnable) {
        this.f37689a = i10;
        this.f37690b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37689a) {
            case 0:
                this.f37690b.run();
                return;
            default:
                Runnable runnable = this.f37690b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
