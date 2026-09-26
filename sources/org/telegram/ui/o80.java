package org.telegram.ui;

import android.view.View;
public final class o80 extends s4.j {
    public final LanguageSelectActivity F;

    public o80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f31094b.invalidate();
        org.telegram.ui.Components.xl0 xl0Var = languageSelectActivity.f31094b;
        int i10 = xl0Var.E1;
        if (i10 != -1 && (view = xl0Var.F1) != null) {
            xl0Var.i1(i10, view);
            xl0Var.invalidate();
        }
    }
}
