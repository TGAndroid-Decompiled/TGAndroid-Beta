package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class o4 extends u61 {
    public final int f29340e;
    public Object f29341f;

    public o4(Object obj, int i10) {
        super("@stickers", (u11) null);
        this.f29340e = i10;
        this.f29341f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f29340e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f29341f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                yy0 yy0Var = (yy0) this.f29341f;
                i10 = ((org.telegram.ui.ActionBar.f3) yy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), yy0Var.L, 1);
                yy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                ad.a0((hg.w) this.f29341f).k(false).j();
                return;
            case 3:
                org.telegram.ui.s70 s70Var = ((org.telegram.ui.q70) this.f29341f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) s70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", s70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.vm0) this.f29341f).f42949a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f29341f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public o4(String str, int i10, Object obj) {
        super(str, (u11) null);
        this.f29340e = i10;
        this.f29341f = obj;
    }

    public o4(String str, u11 u11Var) {
        super(str, u11Var);
        this.f29340e = 2;
    }

    public o4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (u11) null);
        this.f29340e = 0;
        this.f29341f = n2Var;
    }
}
