package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cq0 implements org.telegram.ui.ActionBar.r0 {
    public final mq0 f36415a;

    public cq0(mq0 mq0Var) {
        this.f36415a = mq0Var;
    }

    @Override
    public final void d() {
        int i10;
        int i11;
        mq0 mq0Var = this.f36415a;
        org.telegram.ui.ActionBar.e1 e1Var = mq0Var.Q;
        if (mq0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        e1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.e1 e1Var2 = mq0Var.Q;
        if (mq0Var.Y) {
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
