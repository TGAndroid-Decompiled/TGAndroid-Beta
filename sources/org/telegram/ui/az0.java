package org.telegram.ui;

import android.view.View;
public final class az0 implements View.OnClickListener {
    public final int f36077a;
    public final Runnable f36078b;

    public az0(int i10, Runnable runnable) {
        this.f36077a = i10;
        this.f36078b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36077a) {
            case 0:
                this.f36078b.run();
                return;
            default:
                Runnable runnable = this.f36078b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
