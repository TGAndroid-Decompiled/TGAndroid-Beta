package org.telegram.ui;

import android.view.View;
public final class gz0 implements View.OnClickListener {
    public final int f36335a;
    public final Runnable f36336b;

    public gz0(int i10, Runnable runnable) {
        this.f36335a = i10;
        this.f36336b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36335a) {
            case 0:
                this.f36336b.run();
                return;
            default:
                Runnable runnable = this.f36336b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
