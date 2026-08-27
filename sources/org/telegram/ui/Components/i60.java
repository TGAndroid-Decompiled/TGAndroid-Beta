package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

public final class i60 extends iw0 {
    public final int G;

    public i60(Context context, View view, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, view, i10, c6Var);
        this.G = i11;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.G) {
            case 0:
                super.onAttachedToWindow();
                this.f29504b.getImageReceiver().startAnimation();
                break;
            case 1:
                super.onAttachedToWindow();
                this.f29504b.getImageReceiver().startAnimation();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.G) {
            case 2:
                super.setVisibility(i10);
                if (i10 != 0) {
                    e(false, false);
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
