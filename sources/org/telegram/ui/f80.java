package org.telegram.ui;

import android.view.View;
public final class f80 extends s4.l {
    public final LanguageSelectActivity F;

    public f80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.e1 e1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f35518b.invalidate();
        org.telegram.ui.Components.mm0 mm0Var = languageSelectActivity.f35518b;
        int i10 = mm0Var.C1;
        if (i10 != -1 && (view = mm0Var.D1) != null) {
            mm0Var.l1(i10, view);
            mm0Var.invalidate();
        }
    }
}
