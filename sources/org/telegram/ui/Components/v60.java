package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class v60 extends zw0 {
    public final int H;

    public v60(Context context, View view, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, view, i10, f6Var);
        this.H = i11;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.H) {
            case 0:
                super.onAttachedToWindow();
                this.f31455b.getImageReceiver().startAnimation();
                return;
            case 1:
                super.onAttachedToWindow();
                this.f31455b.getImageReceiver().startAnimation();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.H) {
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
