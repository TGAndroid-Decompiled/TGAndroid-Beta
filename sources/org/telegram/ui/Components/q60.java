package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class q60 extends qw0 {
    public final int G;

    public q60(Context context, View view, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, view, i10, c6Var);
        this.G = i11;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.G) {
            case 0:
                super.onAttachedToWindow();
                this.f32120b.getImageReceiver().startAnimation();
                return;
            case 1:
                super.onAttachedToWindow();
                this.f32120b.getImageReceiver().startAnimation();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.G) {
            case 2:
                super.setVisibility(i10);
                if (i10 != 0) {
                    e(false, false);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
