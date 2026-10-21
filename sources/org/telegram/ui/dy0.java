package org.telegram.ui;

import android.view.View;
public final class dy0 implements View.OnClickListener {
    public final int f36464a;
    public final Runnable f36465b;

    public dy0(int i10, Runnable runnable) {
        this.f36464a = i10;
        this.f36465b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36464a) {
            case 0:
                this.f36465b.run();
                return;
            default:
                Runnable runnable = this.f36465b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
