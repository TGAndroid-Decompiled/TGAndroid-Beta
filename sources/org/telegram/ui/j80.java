package org.telegram.ui;

import android.view.View;
public final class j80 extends f2.l {
    public final LanguageSelectActivity F;

    public j80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f31607b.invalidate();
        org.telegram.ui.Components.sl0 sl0Var = languageSelectActivity.f31607b;
        int i10 = sl0Var.B1;
        if (i10 != -1 && (view = sl0Var.C1) != null) {
            sl0Var.i1(i10, view);
            sl0Var.invalidate();
        }
    }
}
