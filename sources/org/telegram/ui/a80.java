package org.telegram.ui;

import android.view.View;
public final class a80 extends f2.l {
    public final LanguageSelectActivity F;

    public a80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(f2.n1 n1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f35554b.invalidate();
        org.telegram.ui.Components.jl0 jl0Var = languageSelectActivity.f35554b;
        int i10 = jl0Var.A1;
        if (i10 != -1 && (view = jl0Var.B1) != null) {
            jl0Var.i1(i10, view);
            jl0Var.invalidate();
        }
    }
}
