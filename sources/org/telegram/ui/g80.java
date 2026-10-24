package org.telegram.ui;

import android.view.View;
public final class g80 extends s4.k {
    public final LanguageSelectActivity F;

    public g80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33454b.invalidate();
        org.telegram.ui.Components.lm0 lm0Var = languageSelectActivity.f33454b;
        int i10 = lm0Var.C1;
        if (i10 != -1 && (view = lm0Var.D1) != null) {
            lm0Var.k1(i10, view);
            lm0Var.invalidate();
        }
    }
}
