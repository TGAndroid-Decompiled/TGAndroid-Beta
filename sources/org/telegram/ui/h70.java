package org.telegram.ui;

import android.view.View;
public final class h70 extends s4.j {
    public final LanguageSelectActivity F;

    public h70(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33342b.invalidate();
        org.telegram.ui.Components.tk0 tk0Var = languageSelectActivity.f33342b;
        int i10 = tk0Var.C1;
        if (i10 != -1 && (view = tk0Var.D1) != null) {
            tk0Var.k1(i10, view);
            tk0Var.invalidate();
        }
    }
}
