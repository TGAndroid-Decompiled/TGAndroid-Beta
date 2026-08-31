package org.telegram.ui;

import android.view.View;
public final class k80 extends f2.l {
    public final LanguageSelectActivity F;

    public k80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(f2.m1 m1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f34128b.invalidate();
        org.telegram.ui.Components.tl0 tl0Var = languageSelectActivity.f34128b;
        int i10 = tl0Var.B1;
        if (i10 != -1 && (view = tl0Var.C1) != null) {
            tl0Var.i1(i10, view);
            tl0Var.invalidate();
        }
    }
}
