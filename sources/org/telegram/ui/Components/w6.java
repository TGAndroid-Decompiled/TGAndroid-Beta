package org.telegram.ui.Components;

import android.view.View;
public final class w6 implements View.OnClickListener {
    public final int f32606a;
    public final Runnable f32607b;

    public w6(int i10, Runnable runnable) {
        this.f32606a = i10;
        this.f32607b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32606a) {
            case 0:
                this.f32607b.run();
                return;
            case 1:
                Runnable runnable = this.f32607b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f32607b.run();
                return;
        }
    }
}
