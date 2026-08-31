package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class h4 extends n51 {
    public final int f27369e;
    public Object f27370f;

    public h4(Object obj, int i10) {
        super("@stickers", (t01) null);
        this.f27369e = i10;
        this.f27370f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f27369e) {
            case 0:
                ((org.telegram.ui.ActionBar.p2) this.f27370f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                yx0 yx0Var = (yx0) this.f27370f;
                i10 = ((org.telegram.ui.ActionBar.h3) yx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), yx0Var.I, 1);
                yx0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                qc.a0((vf.q) this.f27370f).k(false).j();
                return;
            case 3:
                org.telegram.ui.n70 n70Var = ((org.telegram.ui.l70) this.f27370f).d;
                i11 = ((org.telegram.ui.ActionBar.p2) n70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", n70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.nm0) this.f27370f).f39483a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f27370f;
                i12 = ((org.telegram.ui.ActionBar.p2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public h4(String str, int i10, Object obj) {
        super(str, (t01) null);
        this.f27369e = i10;
        this.f27370f = obj;
    }

    public h4(String str, t01 t01Var) {
        super(str, t01Var);
        this.f27369e = 2;
    }

    public h4(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        super(str, (t01) null);
        this.f27369e = 0;
        this.f27370f = p2Var;
    }
}
