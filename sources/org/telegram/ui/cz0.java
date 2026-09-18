package org.telegram.ui;

import android.view.View;
public final class cz0 implements View.OnClickListener {
    public final int f32976a;
    public final Runnable f32977b;

    public cz0(int i10, Runnable runnable) {
        this.f32976a = i10;
        this.f32977b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32976a) {
            case 0:
                this.f32977b.run();
                return;
            default:
                Runnable runnable = this.f32977b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
