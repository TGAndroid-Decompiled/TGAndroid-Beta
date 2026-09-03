package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dq0 implements org.telegram.ui.ActionBar.t0 {
    public final mq0 f36239a;

    public dq0(mq0 mq0Var) {
        this.f36239a = mq0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        mq0 mq0Var = this.f36239a;
        org.telegram.ui.ActionBar.g1 g1Var = mq0Var.N;
        if (mq0Var.V) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        g1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.g1 g1Var2 = mq0Var.N;
        if (mq0Var.V) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        g1Var2.setIcon(i11);
    }

    @Override
    public final void c() {
    }
}
