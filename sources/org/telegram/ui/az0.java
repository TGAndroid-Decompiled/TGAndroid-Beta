package org.telegram.ui;

import android.view.View;
public final class az0 implements View.OnClickListener {
    public final int f36075a;
    public final Runnable f36076b;

    public az0(int i10, Runnable runnable) {
        this.f36075a = i10;
        this.f36076b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36075a) {
            case 0:
                this.f36076b.run();
                return;
            default:
                Runnable runnable = this.f36076b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
