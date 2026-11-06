package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class p50 extends av0 {
    public final int K;

    public p50(Context context, View view, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, view, i7, f6Var);
        this.K = i10;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.K) {
            case 0:
                super.onAttachedToWindow();
                this.f31923b.getImageReceiver().P0(false);
                return;
            case 1:
                super.onAttachedToWindow();
                this.f31923b.getImageReceiver().P0(false);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.K) {
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
