package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jq0 implements org.telegram.ui.ActionBar.r0 {
    public final tq0 f34851a;

    public jq0(tq0 tq0Var) {
        this.f34851a = tq0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        tq0 tq0Var = this.f34851a;
        org.telegram.ui.ActionBar.e1 e1Var = tq0Var.Q;
        if (tq0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        e1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.e1 e1Var2 = tq0Var.Q;
        if (tq0Var.Y) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        e1Var2.setIcon(i11);
    }

    @Override
    public final void c() {
    }
}
