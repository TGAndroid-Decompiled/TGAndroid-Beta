package org.telegram.ui;

import android.view.View;
public final class c80 extends s4.k {
    public final LanguageSelectActivity F;

    public c80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33145b.invalidate();
        org.telegram.ui.Components.im0 im0Var = languageSelectActivity.f33145b;
        int i10 = im0Var.C1;
        if (i10 != -1 && (view = im0Var.D1) != null) {
            im0Var.i1(i10, view);
            im0Var.invalidate();
        }
    }
}
