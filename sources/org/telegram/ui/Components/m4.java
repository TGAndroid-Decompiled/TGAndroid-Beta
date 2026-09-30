package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class m4 extends c61 {
    public final int e;
    public Object f26201f;

    public m4(Object obj, int i10) {
        super("@stickers", (e11) null);
        this.e = i10;
        this.f26201f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.m2) this.f26201f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                iy0 iy0Var = (iy0) this.f26201f;
                i10 = ((org.telegram.ui.ActionBar.e3) iy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), iy0Var.L, 1);
                iy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                yc.a0((hg.x) this.f26201f).k(false).j();
                return;
            case 3:
                org.telegram.ui.o70 o70Var = ((org.telegram.ui.m70) this.f26201f).d;
                i11 = ((org.telegram.ui.ActionBar.m2) o70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", o70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.nm0) this.f26201f).f36041a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f26201f;
                i12 = ((org.telegram.ui.ActionBar.m2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public m4(String str, int i10, Object obj) {
        super(str, (e11) null);
        this.e = i10;
        this.f26201f = obj;
    }

    public m4(String str, e11 e11Var) {
        super(str, e11Var);
        this.e = 2;
    }

    public m4(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        super(str, (e11) null);
        this.e = 0;
        this.f26201f = m2Var;
    }
}
