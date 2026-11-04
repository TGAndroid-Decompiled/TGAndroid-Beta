package org.telegram.ui.Components;

import android.view.View;
public final class m6 implements View.OnClickListener {
    public final int f36023a;
    public final Runnable f36024b;

    public m6(int i3, Runnable runnable) {
        this.f36023a = i3;
        this.f36024b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36023a) {
            case 0:
                this.f36024b.run();
                return;
            case 1:
                Runnable runnable = this.f36024b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36024b.run();
                return;
        }
    }
}
