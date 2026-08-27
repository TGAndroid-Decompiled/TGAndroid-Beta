package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;

public final class g4 extends r41 {

    public final int f28526e;

    public Object f28527f;

    public g4(Object obj, int i10) {
        super("@stickers", (xz0) null);
        this.f28526e = i10;
        this.f28527f = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28526e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f28527f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                ex0 ex0Var = (ex0) this.f28527f;
                MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) ex0Var).currentAccount).openByUserName(getURL(), ex0Var.H, 1);
                ex0Var.dismiss();
                break;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                mc.a0((qf.s) this.f28527f).k(false).j();
                break;
            case 3:
                org.telegram.ui.c70 c70Var = ((org.telegram.ui.a70) this.f28527f).d;
                MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) c70Var).currentAccount).openByUserName("stickers", c70Var, 1);
                break;
            case 4:
                ((org.telegram.ui.gm0) this.f28527f).f38446a.dismissCurrentDialog();
                super.onClick(view);
                break;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28527f;
                MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount).openByUserName("stickers", stickersActivity, 3);
                break;
        }
    }

    public g4(String str, int i10, Object obj) {
        super(str, (xz0) null);
        this.f28526e = i10;
        this.f28527f = obj;
    }

    public g4(String str, xz0 xz0Var) {
        super(str, xz0Var);
        this.f28526e = 2;
    }

    public g4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (xz0) null);
        this.f28526e = 0;
        this.f28527f = n2Var;
    }
}
