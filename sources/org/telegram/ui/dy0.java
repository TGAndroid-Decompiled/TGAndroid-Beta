package org.telegram.ui;

import android.view.View;
public final class dy0 implements View.OnClickListener {
    public final int f36466a;
    public final Runnable f36467b;

    public dy0(int i10, Runnable runnable) {
        this.f36466a = i10;
        this.f36467b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36466a) {
            case 0:
                this.f36467b.run();
                return;
            default:
                Runnable runnable = this.f36467b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
