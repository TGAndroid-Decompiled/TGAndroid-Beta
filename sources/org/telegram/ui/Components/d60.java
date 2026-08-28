package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class d60 extends gw0 {
    public final int G;

    public d60(Context context, View view, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(context, view, i9, b6Var);
        this.G = i10;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.G) {
            case 0:
                super.onAttachedToWindow();
                this.f28883b.getImageReceiver().startAnimation();
                return;
            case 1:
                super.onAttachedToWindow();
                this.f28883b.getImageReceiver().startAnimation();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.G) {
            case 2:
                super.setVisibility(i9);
                if (i9 != 0) {
                    e(false, false);
                    return;
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }
}
