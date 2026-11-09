package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class q50 extends cv0 {
    public final int K;

    public q50(Context context, View view, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, view, i7, g6Var);
        this.K = i10;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.K) {
            case 0:
                super.onAttachedToWindow();
                this.f32766b.getImageReceiver().P0(false);
                return;
            case 1:
                super.onAttachedToWindow();
                this.f32766b.getImageReceiver().P0(false);
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
