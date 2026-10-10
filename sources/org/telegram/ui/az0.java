package org.telegram.ui;

import android.view.View;
public final class az0 implements View.OnClickListener {
    public final int f36121a;
    public final Runnable f36122b;

    public az0(int i10, Runnable runnable) {
        this.f36121a = i10;
        this.f36122b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36121a) {
            case 0:
                this.f36122b.run();
                return;
            default:
                Runnable runnable = this.f36122b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
