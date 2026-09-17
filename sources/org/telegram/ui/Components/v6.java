package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31141a;
    public final Runnable f31142b;

    public v6(int i10, Runnable runnable) {
        this.f31141a = i10;
        this.f31142b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31141a) {
            case 0:
                this.f31142b.run();
                return;
            case 1:
                Runnable runnable = this.f31142b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31142b.run();
                return;
        }
    }
}
