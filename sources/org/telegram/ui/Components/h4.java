package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class h4 extends l51 {
    public final int f27351e;
    public Object f27352f;

    public h4(Object obj, int i10) {
        super("@stickers", (s01) null);
        this.f27351e = i10;
        this.f27352f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f27351e) {
            case 0:
                ((org.telegram.ui.ActionBar.p2) this.f27352f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                xx0 xx0Var = (xx0) this.f27352f;
                i10 = ((org.telegram.ui.ActionBar.h3) xx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), xx0Var.I, 1);
                xx0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                qc.a0((vf.q) this.f27352f).k(false).j();
                return;
            case 3:
                org.telegram.ui.n70 n70Var = ((org.telegram.ui.l70) this.f27352f).d;
                i11 = ((org.telegram.ui.ActionBar.p2) n70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", n70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.nm0) this.f27352f).f39404a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f27352f;
                i12 = ((org.telegram.ui.ActionBar.p2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public h4(String str, int i10, Object obj) {
        super(str, (s01) null);
        this.f27351e = i10;
        this.f27352f = obj;
    }

    public h4(String str, s01 s01Var) {
        super(str, s01Var);
        this.f27351e = 2;
    }

    public h4(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        super(str, (s01) null);
        this.f27351e = 0;
        this.f27352f = p2Var;
    }
}
