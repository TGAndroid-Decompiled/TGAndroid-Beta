package org.telegram.ui.Components;

import android.view.View;
public final class s6 implements View.OnClickListener {
    public final int f39511a;
    public final Runnable f39512b;

    public s6(int i7, Runnable runnable) {
        this.f39511a = i7;
        this.f39512b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39511a) {
            case 0:
                this.f39512b.run();
                return;
            case 1:
                Runnable runnable = this.f39512b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39512b.run();
                return;
        }
    }
}
