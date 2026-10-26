package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class o4 extends x61 {
    public final int e;
    public Object f31151f;

    public o4(Object obj, int i10) {
        super("@stickers", (y11) null);
        this.e = i10;
        this.f31151f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.r2) this.f31151f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                cz0 cz0Var = (cz0) this.f31151f;
                i10 = ((org.telegram.ui.ActionBar.k3) cz0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), cz0Var.L, 1);
                cz0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                wc.b0((jg.w) this.f31151f).k(false).j();
                return;
            case 3:
                org.telegram.ui.f70 f70Var = ((org.telegram.ui.d70) this.f31151f).d;
                i11 = ((org.telegram.ui.ActionBar.r2) f70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", f70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.qm0) this.f31151f).f42875a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f31151f;
                i12 = ((org.telegram.ui.ActionBar.r2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public o4(String str, int i10, Object obj) {
        super(str, (y11) null);
        this.e = i10;
        this.f31151f = obj;
    }

    public o4(String str, y11 y11Var) {
        super(str, y11Var);
        this.e = 2;
    }

    public o4(org.telegram.ui.ActionBar.r2 r2Var, String str) {
        super(str, (y11) null);
        this.e = 0;
        this.f31151f = r2Var;
    }
}
