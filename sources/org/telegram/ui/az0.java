package org.telegram.ui;

import android.view.View;
public final class az0 implements View.OnClickListener {
    public final int f32009a;
    public final Runnable f32010b;

    public az0(int i10, Runnable runnable) {
        this.f32009a = i10;
        this.f32010b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32009a) {
            case 0:
                this.f32010b.run();
                return;
            default:
                Runnable runnable = this.f32010b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
