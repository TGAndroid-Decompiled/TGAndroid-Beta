package org.telegram.ui.Components;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f39739a;
    public final Runnable f39740b;

    public t6(int i7, Runnable runnable) {
        this.f39739a = i7;
        this.f39740b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39739a) {
            case 0:
                this.f39740b.run();
                return;
            case 1:
                Runnable runnable = this.f39740b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39740b.run();
                return;
        }
    }
}
