package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class k4 extends n51 {
    public final int e;
    public Object f25559f;

    public k4(Object obj, int i10) {
        super("@stickers", (p01) null);
        this.e = i10;
        this.f25559f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.o2) this.f25559f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                wx0 wx0Var = (wx0) this.f25559f;
                i10 = ((org.telegram.ui.ActionBar.g3) wx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), wx0Var.L, 1);
                wx0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                vc.a0((hg.v) this.f25559f).k(false).j();
                return;
            case 3:
                org.telegram.ui.v70 v70Var = ((org.telegram.ui.t70) this.f25559f).d;
                i11 = ((org.telegram.ui.ActionBar.o2) v70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", v70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.ym0) this.f25559f).f39941a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f25559f;
                i12 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public k4(String str, int i10, Object obj) {
        super(str, (p01) null);
        this.e = i10;
        this.f25559f = obj;
    }

    public k4(String str, p01 p01Var) {
        super(str, p01Var);
        this.e = 2;
    }

    public k4(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        super(str, (p01) null);
        this.e = 0;
        this.f25559f = o2Var;
    }
}
