package org.telegram.ui;

import android.view.View;
public final class dy0 implements View.OnClickListener {
    public final int f36468a;
    public final Runnable f36469b;

    public dy0(int i10, Runnable runnable) {
        this.f36468a = i10;
        this.f36469b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36468a) {
            case 0:
                this.f36469b.run();
                return;
            default:
                Runnable runnable = this.f36469b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
