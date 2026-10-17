package org.telegram.ui;

import android.view.View;
public final class fy0 implements View.OnClickListener {
    public final int f37056a;
    public final Runnable f37057b;

    public fy0(int i10, Runnable runnable) {
        this.f37056a = i10;
        this.f37057b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37056a) {
            case 0:
                this.f37057b.run();
                return;
            default:
                Runnable runnable = this.f37057b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
