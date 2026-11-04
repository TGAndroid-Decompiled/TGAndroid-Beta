package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class m50 extends zu0 {
    public final int L;

    public m50(Context context, View view, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, view, i3, e6Var);
        this.L = i10;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.L) {
            case 0:
                super.onAttachedToWindow();
                this.f41126b.getImageReceiver().P0(false);
                return;
            case 1:
                super.onAttachedToWindow();
                this.f41126b.getImageReceiver().P0(false);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void setVisibility(int i3) {
        switch (this.L) {
            case 2:
                super.setVisibility(i3);
                if (i3 != 0) {
                    e(false, false);
                    return;
                }
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }
}
