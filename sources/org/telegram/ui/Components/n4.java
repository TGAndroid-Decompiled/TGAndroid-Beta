package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class n4 extends l61 {
    public final int e;
    public Object f28682f;

    public n4(Object obj, int i10) {
        super("@stickers", (n11) null);
        this.e = i10;
        this.f28682f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f28682f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                qy0 qy0Var = (qy0) this.f28682f;
                i10 = ((org.telegram.ui.ActionBar.f3) qy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), qy0Var.L, 1);
                qy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((ig.v) this.f28682f).k(false).j();
                return;
            case 3:
                org.telegram.ui.a70 a70Var = ((org.telegram.ui.y60) this.f28682f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) a70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", a70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.em0) this.f28682f).f36687a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28682f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public n4(String str, int i10, Object obj) {
        super(str, (n11) null);
        this.e = i10;
        this.f28682f = obj;
    }

    public n4(String str, n11 n11Var) {
        super(str, n11Var);
        this.e = 2;
    }

    public n4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (n11) null);
        this.e = 0;
        this.f28682f = n2Var;
    }
}
