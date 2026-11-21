package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;
public final class an extends org.telegram.ui.ActionBar.m5 {
    public boolean N0;
    public final bn O0;

    public an(bn bnVar, Activity activity) {
        super(activity);
        this.O0 = bnVar;
        this.N0 = true;
    }

    @Override
    public final void d(int i7) {
        super.d(i7);
        if (this.N0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            bn bnVar = this.O0;
            bnVar.V2 = L;
            NumberTextView numberTextView = bnVar.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
