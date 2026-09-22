package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class l4 extends c61 {
    public final int e;
    public Object f25979f;

    public l4(Object obj, int i10) {
        super("@stickers", (e11) null);
        this.e = i10;
        this.f25979f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f25979f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                iy0 iy0Var = (iy0) this.f25979f;
                i10 = ((org.telegram.ui.ActionBar.f3) iy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), iy0Var.L, 1);
                iy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((hg.v) this.f25979f).k(false).j();
                return;
            case 3:
                org.telegram.ui.t70 t70Var = ((org.telegram.ui.r70) this.f25979f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) t70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", t70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.xm0) this.f25979f).f39646a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f25979f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public l4(String str, int i10, Object obj) {
        super(str, (e11) null);
        this.e = i10;
        this.f25979f = obj;
    }

    public l4(String str, e11 e11Var) {
        super(str, e11Var);
        this.e = 2;
    }

    public l4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (e11) null);
        this.e = 0;
        this.f25979f = n2Var;
    }
}
