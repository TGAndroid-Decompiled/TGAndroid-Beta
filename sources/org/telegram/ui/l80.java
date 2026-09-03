package org.telegram.ui;

import android.view.View;
public final class l80 extends f2.l {
    public final LanguageSelectActivity F;

    public l80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f31581b.invalidate();
        org.telegram.ui.Components.rl0 rl0Var = languageSelectActivity.f31581b;
        int i10 = rl0Var.B1;
        if (i10 != -1 && (view = rl0Var.C1) != null) {
            rl0Var.h1(i10, view);
            rl0Var.invalidate();
        }
    }
}
