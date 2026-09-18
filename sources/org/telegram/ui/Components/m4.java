package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class m4 extends b61 {
    public final int e;
    public Object f26322f;

    public m4(Object obj, int i10) {
        super("@stickers", (d11) null);
        this.e = i10;
        this.f26322f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f26322f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                hy0 hy0Var = (hy0) this.f26322f;
                i10 = ((org.telegram.ui.ActionBar.f3) hy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), hy0Var.L, 1);
                hy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((hg.v) this.f26322f).k(false).j();
                return;
            case 3:
                org.telegram.ui.t70 t70Var = ((org.telegram.ui.r70) this.f26322f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) t70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", t70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.xm0) this.f26322f).f39521a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f26322f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public m4(String str, int i10, Object obj) {
        super(str, (d11) null);
        this.e = i10;
        this.f26322f = obj;
    }

    public m4(String str, d11 d11Var) {
        super(str, d11Var);
        this.e = 2;
    }

    public m4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (d11) null);
        this.e = 0;
        this.f26322f = n2Var;
    }
}
