package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class l4 extends p61 {
    public final int e;
    public Object f28161f;

    public l4(Object obj, int i10) {
        super("@stickers", (p11) null);
        this.e = i10;
        this.f28161f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.o2) this.f28161f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                sy0 sy0Var = (sy0) this.f28161f;
                i10 = ((org.telegram.ui.ActionBar.h3) sy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), sy0Var.L, 1);
                sy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                vc.a0((ig.v) this.f28161f).k(false).j();
                return;
            case 3:
                org.telegram.ui.e70 e70Var = ((org.telegram.ui.c70) this.f28161f).d;
                i11 = ((org.telegram.ui.ActionBar.o2) e70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", e70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.hm0) this.f28161f).f37903a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28161f;
                i12 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public l4(String str, int i10, Object obj) {
        super(str, (p11) null);
        this.e = i10;
        this.f28161f = obj;
    }

    public l4(String str, p11 p11Var) {
        super(str, p11Var);
        this.e = 2;
    }

    public l4(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        super(str, (p11) null);
        this.e = 0;
        this.f28161f = o2Var;
    }
}
