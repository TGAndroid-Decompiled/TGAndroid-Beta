package org.telegram.ui;

import android.view.View;
public final class bz0 implements View.OnClickListener {
    public final int f34973a;
    public final Runnable f34974b;

    public bz0(int i10, Runnable runnable) {
        this.f34973a = i10;
        this.f34974b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34973a) {
            case 0:
                this.f34974b.run();
                return;
            default:
                Runnable runnable = this.f34974b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
