package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class l4 extends z51 {
    public final int e;
    public Object f24863f;

    public l4(Object obj, int i10) {
        super("@stickers", (b11) null);
        this.e = i10;
        this.f24863f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.p2) this.f24863f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                hy0 hy0Var = (hy0) this.f24863f;
                i10 = ((org.telegram.ui.ActionBar.h3) hy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), hy0Var.L, 1);
                hy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                wc.a0((gg.x) this.f24863f).k(false).j();
                return;
            case 3:
                org.telegram.ui.s70 s70Var = ((org.telegram.ui.q70) this.f24863f).d;
                i11 = ((org.telegram.ui.ActionBar.p2) s70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", s70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.wm0) this.f24863f).f38247a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f24863f;
                i12 = ((org.telegram.ui.ActionBar.p2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public l4(String str, int i10, Object obj) {
        super(str, (b11) null);
        this.e = i10;
        this.f24863f = obj;
    }

    public l4(String str, b11 b11Var) {
        super(str, b11Var);
        this.e = 2;
    }

    public l4(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        super(str, (b11) null);
        this.e = 0;
        this.f24863f = p2Var;
    }
}
