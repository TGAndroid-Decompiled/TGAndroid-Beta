package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jq0 implements org.telegram.ui.ActionBar.t0 {
    public final tq0 f40581a;

    public jq0(tq0 tq0Var) {
        this.f40581a = tq0Var;
    }

    @Override
    public final void b() {
        int i10;
        int i11;
        tq0 tq0Var = this.f40581a;
        org.telegram.ui.ActionBar.g1 g1Var = tq0Var.Q;
        if (tq0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        g1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.g1 g1Var2 = tq0Var.Q;
        if (tq0Var.Y) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        g1Var2.setIcon(i11);
    }

    @Override
    public final void a() {
    }
}
