package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hq0 implements org.telegram.ui.ActionBar.t0 {
    public final rq0 f40053a;

    public hq0(rq0 rq0Var) {
        this.f40053a = rq0Var;
    }

    @Override
    public final void b() {
        int i10;
        int i11;
        rq0 rq0Var = this.f40053a;
        org.telegram.ui.ActionBar.g1 g1Var = rq0Var.Q;
        if (rq0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        g1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.g1 g1Var2 = rq0Var.Q;
        if (rq0Var.Y) {
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
