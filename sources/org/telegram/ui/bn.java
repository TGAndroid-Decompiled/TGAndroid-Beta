package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;
public final class bn extends org.telegram.ui.ActionBar.l5 {
    public boolean M0;
    public final cn N0;

    public bn(cn cnVar, Activity activity) {
        super(activity);
        this.N0 = cnVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i7) {
        super.d(i7);
        if (this.M0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            cn cnVar = this.N0;
            cnVar.U2 = L;
            NumberTextView numberTextView = cnVar.T2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
