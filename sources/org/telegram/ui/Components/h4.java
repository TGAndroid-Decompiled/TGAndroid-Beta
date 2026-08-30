package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class h4 extends m51 {
    public final int e;
    public Object f25321f;

    public h4(Object obj, int i10) {
        super("@stickers", (s01) null);
        this.e = i10;
        this.f25321f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.p2) this.f25321f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                xx0 xx0Var = (xx0) this.f25321f;
                i10 = ((org.telegram.ui.ActionBar.g3) xx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), xx0Var.I, 1);
                xx0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                qc.a0((uf.q) this.f25321f).k(false).j();
                return;
            case 3:
                org.telegram.ui.m70 m70Var = ((org.telegram.ui.k70) this.f25321f).d;
                i11 = ((org.telegram.ui.ActionBar.p2) m70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", m70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.lm0) this.f25321f).f36108a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f25321f;
                i12 = ((org.telegram.ui.ActionBar.p2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public h4(String str, int i10, Object obj) {
        super(str, (s01) null);
        this.e = i10;
        this.f25321f = obj;
    }

    public h4(String str, s01 s01Var) {
        super(str, s01Var);
        this.e = 2;
    }

    public h4(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        super(str, (s01) null);
        this.e = 0;
        this.f25321f = p2Var;
    }
}
