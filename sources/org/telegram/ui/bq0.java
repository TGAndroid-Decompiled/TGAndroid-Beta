package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bq0 implements org.telegram.ui.ActionBar.r0 {
    public final lq0 f35748a;

    public bq0(lq0 lq0Var) {
        this.f35748a = lq0Var;
    }

    @Override
    public final void f() {
        int i10;
        int i11;
        lq0 lq0Var = this.f35748a;
        org.telegram.ui.ActionBar.e1 e1Var = lq0Var.Q;
        if (lq0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        e1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.e1 e1Var2 = lq0Var.Q;
        if (lq0Var.Y) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        e1Var2.setIcon(i11);
    }

    @Override
    public final void e() {
    }
}
