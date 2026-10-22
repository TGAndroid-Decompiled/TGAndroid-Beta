package org.telegram.ui;

import android.view.View;
public final class dy0 implements View.OnClickListener {
    public final int f36467a;
    public final Runnable f36468b;

    public dy0(int i10, Runnable runnable) {
        this.f36467a = i10;
        this.f36468b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36467a) {
            case 0:
                this.f36468b.run();
                return;
            default:
                Runnable runnable = this.f36468b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
