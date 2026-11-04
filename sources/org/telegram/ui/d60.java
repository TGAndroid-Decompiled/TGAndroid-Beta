package org.telegram.ui;

import android.view.View;
public final class d60 extends u4.k {
    public final LanguageSelectActivity F;

    public d60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(u4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f41277b.invalidate();
        org.telegram.ui.Components.tj0 tj0Var = languageSelectActivity.f41277b;
        int i3 = tj0Var.D1;
        if (i3 != -1 && (view = tj0Var.E1) != null) {
            tj0Var.k1(i3, view);
            tj0Var.invalidate();
        }
    }
}
