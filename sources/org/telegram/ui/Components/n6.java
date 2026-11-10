package org.telegram.ui.Components;

import android.view.View;
public final class n6 implements View.OnClickListener {
    public final int f36247a;
    public final Runnable f36248b;

    public n6(int i7, Runnable runnable) {
        this.f36247a = i7;
        this.f36248b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36247a) {
            case 0:
                this.f36248b.run();
                return;
            case 1:
                Runnable runnable = this.f36248b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36248b.run();
                return;
        }
    }
}
