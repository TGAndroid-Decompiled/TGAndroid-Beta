package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class m4 extends z51 {
    public final int e;
    public Object f26351f;

    public m4(Object obj, int i10) {
        super("@stickers", (b11) null);
        this.e = i10;
        this.f26351f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.m2) this.f26351f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                fy0 fy0Var = (fy0) this.f26351f;
                i10 = ((org.telegram.ui.ActionBar.e3) fy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), fy0Var.L, 1);
                fy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((hg.x) this.f26351f).k(false).j();
                return;
            case 3:
                org.telegram.ui.o70 o70Var = ((org.telegram.ui.m70) this.f26351f).d;
                i11 = ((org.telegram.ui.ActionBar.m2) o70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", o70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.om0) this.f26351f).f36269a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f26351f;
                i12 = ((org.telegram.ui.ActionBar.m2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public m4(String str, int i10, Object obj) {
        super(str, (b11) null);
        this.e = i10;
        this.f26351f = obj;
    }

    public m4(String str, b11 b11Var) {
        super(str, b11Var);
        this.e = 2;
    }

    public m4(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        super(str, (b11) null);
        this.e = 0;
        this.f26351f = m2Var;
    }
}
