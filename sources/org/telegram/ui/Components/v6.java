package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31165a;
    public final Runnable f31166b;

    public v6(int i10, Runnable runnable) {
        this.f31165a = i10;
        this.f31166b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31165a) {
            case 0:
                this.f31166b.run();
                return;
            case 1:
                Runnable runnable = this.f31166b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31166b.run();
                return;
        }
    }
}
