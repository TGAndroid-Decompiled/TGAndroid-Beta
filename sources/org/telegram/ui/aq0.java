package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class aq0 implements org.telegram.ui.ActionBar.r0 {
    public final kq0 f35480a;

    public aq0(kq0 kq0Var) {
        this.f35480a = kq0Var;
    }

    @Override
    public final void f() {
        int i10;
        int i11;
        kq0 kq0Var = this.f35480a;
        org.telegram.ui.ActionBar.e1 e1Var = kq0Var.Q;
        if (kq0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        e1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.e1 e1Var2 = kq0Var.Q;
        if (kq0Var.Y) {
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
