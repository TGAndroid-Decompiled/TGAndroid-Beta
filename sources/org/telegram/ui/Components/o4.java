package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class o4 extends y61 {
    public final int e;
    public Object f31153f;

    public o4(Object obj, int i10) {
        super("@stickers", (z11) null);
        this.e = i10;
        this.f31153f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.r2) this.f31153f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                dz0 dz0Var = (dz0) this.f31153f;
                i10 = ((org.telegram.ui.ActionBar.k3) dz0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), dz0Var.L, 1);
                dz0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                wc.b0((jg.w) this.f31153f).k(false).j();
                return;
            case 3:
                org.telegram.ui.h70 h70Var = ((org.telegram.ui.f70) this.f31153f).d;
                i11 = ((org.telegram.ui.ActionBar.r2) h70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", h70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.sm0) this.f31153f).f43362a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f31153f;
                i12 = ((org.telegram.ui.ActionBar.r2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public o4(String str, int i10, Object obj) {
        super(str, (z11) null);
        this.e = i10;
        this.f31153f = obj;
    }

    public o4(String str, z11 z11Var) {
        super(str, z11Var);
        this.e = 2;
    }

    public o4(org.telegram.ui.ActionBar.r2 r2Var, String str) {
        super(str, (z11) null);
        this.e = 0;
        this.f31153f = r2Var;
    }
}
