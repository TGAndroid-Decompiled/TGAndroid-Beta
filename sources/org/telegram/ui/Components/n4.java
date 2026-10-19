package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class n4 extends k61 {
    public final int e;
    public Object f28673f;

    public n4(Object obj, int i10) {
        super("@stickers", (m11) null);
        this.e = i10;
        this.f28673f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f28673f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                py0 py0Var = (py0) this.f28673f;
                i10 = ((org.telegram.ui.ActionBar.f3) py0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), py0Var.L, 1);
                py0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((ig.v) this.f28673f).k(false).j();
                return;
            case 3:
                org.telegram.ui.a70 a70Var = ((org.telegram.ui.y60) this.f28673f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) a70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", a70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.em0) this.f28673f).f36686a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28673f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public n4(String str, int i10, Object obj) {
        super(str, (m11) null);
        this.e = i10;
        this.f28673f = obj;
    }

    public n4(String str, m11 m11Var) {
        super(str, m11Var);
        this.e = 2;
    }

    public n4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (m11) null);
        this.e = 0;
        this.f28673f = n2Var;
    }
}
