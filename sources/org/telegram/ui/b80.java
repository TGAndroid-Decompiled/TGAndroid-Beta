package org.telegram.ui;

import android.view.View;

public final class b80 extends f2.l {
    public final LanguageSelectActivity F;

    public b80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(f2.o1 o1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f35490b.invalidate();
        org.telegram.ui.Components.zk0 zk0Var = languageSelectActivity.f35490b;
        int i10 = zk0Var.A1;
        if (i10 == -1 || (view = zk0Var.B1) == null) {
            return;
        }
        zk0Var.i1(i10, view);
        zk0Var.invalidate();
    }
}
