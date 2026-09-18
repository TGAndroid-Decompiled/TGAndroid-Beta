package org.telegram.ui;

import android.view.View;
public final class az0 implements View.OnClickListener {
    public final int f32203a;
    public final Runnable f32204b;

    public az0(int i10, Runnable runnable) {
        this.f32203a = i10;
        this.f32204b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32203a) {
            case 0:
                this.f32204b.run();
                return;
            default:
                Runnable runnable = this.f32204b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
