package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31191a;
    public final Runnable f31192b;

    public v6(int i10, Runnable runnable) {
        this.f31191a = i10;
        this.f31192b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31191a) {
            case 0:
                this.f31192b.run();
                return;
            case 1:
                Runnable runnable = this.f31192b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31192b.run();
                return;
        }
    }
}
