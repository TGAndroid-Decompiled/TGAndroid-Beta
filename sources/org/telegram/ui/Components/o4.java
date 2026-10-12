package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class o4 extends p61 {
    public final int e;
    public Object f27828f;

    public o4(Object obj, int i10) {
        super("@stickers", (p11) null);
        this.e = i10;
        this.f27828f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.m2) this.f27828f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                ty0 ty0Var = (ty0) this.f27828f;
                i10 = ((org.telegram.ui.ActionBar.e3) ty0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), ty0Var.L, 1);
                ty0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                zc.a0((ig.v) this.f27828f).k(false).j();
                return;
            case 3:
                org.telegram.ui.y70 y70Var = ((org.telegram.ui.w70) this.f27828f).d;
                i11 = ((org.telegram.ui.ActionBar.m2) y70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", y70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.bn0) this.f27828f).f34600a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f27828f;
                i12 = ((org.telegram.ui.ActionBar.m2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public o4(String str, int i10, Object obj) {
        super(str, (p11) null);
        this.e = i10;
        this.f27828f = obj;
    }

    public o4(String str, p11 p11Var) {
        super(str, p11Var);
        this.e = 2;
    }

    public o4(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        super(str, (p11) null);
        this.e = 0;
        this.f27828f = m2Var;
    }
}
