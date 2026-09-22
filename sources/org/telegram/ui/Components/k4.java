package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class k4 extends m51 {
    public final int e;
    public Object f25532f;

    public k4(Object obj, int i10) {
        super("@stickers", (o01) null);
        this.e = i10;
        this.f25532f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f25532f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                vx0 vx0Var = (vx0) this.f25532f;
                i10 = ((org.telegram.ui.ActionBar.f3) vx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), vx0Var.L, 1);
                vx0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                vc.a0((hg.x) this.f25532f).k(false).j();
                return;
            case 3:
                org.telegram.ui.t70 t70Var = ((org.telegram.ui.r70) this.f25532f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) t70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", t70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.wm0) this.f25532f).f39261a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f25532f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public k4(String str, int i10, Object obj) {
        super(str, (o01) null);
        this.e = i10;
        this.f25532f = obj;
    }

    public k4(String str, o01 o01Var) {
        super(str, o01Var);
        this.e = 2;
    }

    public k4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (o01) null);
        this.e = 0;
        this.f25532f = n2Var;
    }
}
