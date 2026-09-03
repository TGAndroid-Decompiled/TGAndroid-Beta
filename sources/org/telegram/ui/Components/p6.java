package org.telegram.ui.Components;

import android.view.View;
public final class p6 implements View.OnClickListener {
    public final int f29991a;
    public final Runnable f29992b;

    public p6(int i10, Runnable runnable) {
        this.f29991a = i10;
        this.f29992b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29991a) {
            case 0:
                this.f29992b.run();
                return;
            case 1:
                Runnable runnable = this.f29992b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f29992b.run();
                return;
        }
    }
}
