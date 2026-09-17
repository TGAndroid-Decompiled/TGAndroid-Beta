package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class m4 extends l51 {
    public final int f28401e;
    public Object f28402f;

    public m4(Object obj, int i10) {
        super("@stickers", (n01) null);
        this.f28401e = i10;
        this.f28402f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f28401e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f28402f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                ux0 ux0Var = (ux0) this.f28402f;
                i10 = ((org.telegram.ui.ActionBar.f3) ux0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), ux0Var.L, 1);
                ux0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                yc.a0((ig.v) this.f28402f).k(false).j();
                return;
            case 3:
                org.telegram.ui.u70 u70Var = ((org.telegram.ui.s70) this.f28402f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) u70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", u70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.xm0) this.f28402f).f42791a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28402f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public m4(String str, int i10, Object obj) {
        super(str, (n01) null);
        this.f28401e = i10;
        this.f28402f = obj;
    }

    public m4(String str, n01 n01Var) {
        super(str, n01Var);
        this.f28401e = 2;
    }

    public m4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (n01) null);
        this.f28401e = 0;
        this.f28402f = n2Var;
    }
}
