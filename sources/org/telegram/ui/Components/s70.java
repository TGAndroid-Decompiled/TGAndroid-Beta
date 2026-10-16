package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class s70 extends wx0 {
    public final int K;

    public s70(Context context, View view, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, view, i10, c6Var);
        this.K = i11;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.K) {
            case 0:
                super.onAttachedToWindow();
                this.f30688b.getImageReceiver().startAnimation();
                return;
            case 1:
                super.onAttachedToWindow();
                this.f30688b.getImageReceiver().startAnimation();
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
