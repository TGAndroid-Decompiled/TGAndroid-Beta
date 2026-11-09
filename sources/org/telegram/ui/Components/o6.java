package org.telegram.ui.Components;

import android.view.View;
public final class o6 implements View.OnClickListener {
    public final int f36657a;
    public final Runnable f36658b;

    public o6(int i7, Runnable runnable) {
        this.f36657a = i7;
        this.f36658b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36657a) {
            case 0:
                this.f36658b.run();
                return;
            case 1:
                Runnable runnable = this.f36658b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36658b.run();
                return;
        }
    }
}
