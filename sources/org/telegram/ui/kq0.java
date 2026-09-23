package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kq0 implements org.telegram.ui.ActionBar.s0 {
    public final uq0 f34783a;

    public kq0(uq0 uq0Var) {
        this.f34783a = uq0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        uq0 uq0Var = this.f34783a;
        org.telegram.ui.ActionBar.f1 f1Var = uq0Var.Q;
        if (uq0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        f1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.f1 f1Var2 = uq0Var.Q;
        if (uq0Var.Y) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        f1Var2.setIcon(i11);
    }

    @Override
    public final void c() {
    }
}
