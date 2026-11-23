package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class d60 extends nv0 {
    public final int L;

    public d60(Context context, View view, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(context, view, i7, h6Var);
        this.L = i10;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.L) {
            case 0:
                super.onAttachedToWindow();
                this.f37994b.getImageReceiver().P0(false);
                return;
            case 1:
                super.onAttachedToWindow();
                this.f37994b.getImageReceiver().P0(false);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.L) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    e(false, false);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
