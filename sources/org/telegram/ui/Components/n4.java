package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class n4 extends j61 {
    public final int e;
    public Object f28651f;

    public n4(Object obj, int i10) {
        super("@stickers", (l11) null);
        this.e = i10;
        this.f28651f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f28651f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                oy0 oy0Var = (oy0) this.f28651f;
                i10 = ((org.telegram.ui.ActionBar.f3) oy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), oy0Var.L, 1);
                oy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((ig.v) this.f28651f).k(false).j();
                return;
            case 3:
                org.telegram.ui.c70 c70Var = ((org.telegram.ui.a70) this.f28651f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) c70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", c70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.gm0) this.f28651f).f37271a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28651f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public n4(String str, int i10, Object obj) {
        super(str, (l11) null);
        this.e = i10;
        this.f28651f = obj;
    }

    public n4(String str, l11 l11Var) {
        super(str, l11Var);
        this.e = 2;
    }

    public n4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (l11) null);
        this.e = 0;
        this.f28651f = n2Var;
    }
}
