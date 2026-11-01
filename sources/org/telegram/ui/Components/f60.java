package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class f60 extends ew0 {
    public final int K;

    public f60(Context context, View view, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11) {
        super(context, view, i10, p6Var);
        this.K = i11;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.K) {
            case 0:
                super.onAttachedToWindow();
                this.f25947b.getImageReceiver().P0(false);
                return;
            case 1:
                super.onAttachedToWindow();
                this.f25947b.getImageReceiver().P0(false);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.K) {
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
