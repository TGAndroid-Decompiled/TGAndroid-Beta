package org.telegram.ui.Components;

import android.view.View;
public final class p6 implements View.OnClickListener {
    public final int f29973a;
    public final Runnable f29974b;

    public p6(int i10, Runnable runnable) {
        this.f29973a = i10;
        this.f29974b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29973a) {
            case 0:
                this.f29974b.run();
                return;
            case 1:
                Runnable runnable = this.f29974b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f29974b.run();
                return;
        }
    }
}
