package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class m4 extends k61 {
    public final int f28520e;
    public Object f28521f;

    public m4(Object obj, int i10) {
        super("@stickers", (m11) null);
        this.f28520e = i10;
        this.f28521f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f28520e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f28521f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                qy0 qy0Var = (qy0) this.f28521f;
                i10 = ((org.telegram.ui.ActionBar.f3) qy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), qy0Var.L, 1);
                qy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                yc.a0((hg.w) this.f28521f).k(false).j();
                return;
            case 3:
                org.telegram.ui.s70 s70Var = ((org.telegram.ui.q70) this.f28521f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) s70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", s70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.sm0) this.f28521f).f40538a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28521f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public m4(String str, int i10, Object obj) {
        super(str, (m11) null);
        this.f28520e = i10;
        this.f28521f = obj;
    }

    public m4(String str, m11 m11Var) {
        super(str, m11Var);
        this.f28520e = 2;
    }

    public m4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (m11) null);
        this.f28520e = 0;
        this.f28521f = n2Var;
    }
}
