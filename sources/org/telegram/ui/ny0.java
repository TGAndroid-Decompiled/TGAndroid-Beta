package org.telegram.ui;

import android.view.View;
public final class ny0 implements View.OnClickListener {
    public final int f39480a;
    public final Runnable f39481b;

    public ny0(int i10, Runnable runnable) {
        this.f39480a = i10;
        this.f39481b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39480a) {
            case 0:
                this.f39481b.run();
                return;
            default:
                Runnable runnable = this.f39481b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
