package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mq0 implements org.telegram.ui.ActionBar.s0 {
    public final wq0 f38744a;

    public mq0(wq0 wq0Var) {
        this.f38744a = wq0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        wq0 wq0Var = this.f38744a;
        org.telegram.ui.ActionBar.f1 f1Var = wq0Var.Q;
        if (wq0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        f1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.f1 f1Var2 = wq0Var.Q;
        if (wq0Var.Y) {
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
