package org.telegram.ui;

import android.view.View;
public final class ny0 implements View.OnClickListener {
    public final int f36603a;
    public final Runnable f36604b;

    public ny0(int i10, Runnable runnable) {
        this.f36603a = i10;
        this.f36604b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36603a) {
            case 0:
                this.f36604b.run();
                return;
            default:
                Runnable runnable = this.f36604b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
