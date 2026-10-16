package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class o4 extends q61 {
    public final int e;
    public Object f27527f;

    public o4(Object obj, int i10) {
        super("@stickers", (q11) null);
        this.e = i10;
        this.f27527f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.m2) this.f27527f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                uy0 uy0Var = (uy0) this.f27527f;
                i10 = ((org.telegram.ui.ActionBar.e3) uy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), uy0Var.L, 1);
                uy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                zc.a0((ig.v) this.f27527f).k(false).j();
                return;
            case 3:
                org.telegram.ui.y70 y70Var = ((org.telegram.ui.w70) this.f27527f).d;
                i11 = ((org.telegram.ui.ActionBar.m2) y70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", y70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.an0) this.f27527f).f33999a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f27527f;
                i12 = ((org.telegram.ui.ActionBar.m2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public o4(String str, int i10, Object obj) {
        super(str, (q11) null);
        this.e = i10;
        this.f27527f = obj;
    }

    public o4(String str, q11 q11Var) {
        super(str, q11Var);
        this.e = 2;
    }

    public o4(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        super(str, (q11) null);
        this.e = 0;
        this.f27527f = m2Var;
    }
}
