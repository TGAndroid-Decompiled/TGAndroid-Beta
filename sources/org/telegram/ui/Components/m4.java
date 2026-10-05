package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class m4 extends l61 {
    public final int f28595e;
    public Object f28596f;

    public m4(Object obj, int i10) {
        super("@stickers", (n11) null);
        this.f28595e = i10;
        this.f28596f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f28595e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f28596f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                ry0 ry0Var = (ry0) this.f28596f;
                i10 = ((org.telegram.ui.ActionBar.f3) ry0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), ry0Var.L, 1);
                ry0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                yc.a0((hg.w) this.f28596f).k(false).j();
                return;
            case 3:
                org.telegram.ui.s70 s70Var = ((org.telegram.ui.q70) this.f28596f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) s70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", s70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.sm0) this.f28596f).f40550a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28596f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public m4(String str, int i10, Object obj) {
        super(str, (n11) null);
        this.f28595e = i10;
        this.f28596f = obj;
    }

    public m4(String str, n11 n11Var) {
        super(str, n11Var);
        this.f28595e = 2;
    }

    public m4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (n11) null);
        this.f28595e = 0;
        this.f28596f = n2Var;
    }
}
