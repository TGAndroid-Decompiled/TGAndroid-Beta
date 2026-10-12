package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class o4 extends y61 {
    public final int f29050e;
    public Object f29051f;

    public o4(Object obj, int i10) {
        super("@stickers", (z11) null);
        this.f29050e = i10;
        this.f29051f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f29050e) {
            case 0:
                ((org.telegram.ui.ActionBar.m2) this.f29051f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                dz0 dz0Var = (dz0) this.f29051f;
                i10 = ((org.telegram.ui.ActionBar.e3) dz0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), dz0Var.L, 1);
                dz0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                zc.a0((hg.w) this.f29051f).k(false).j();
                return;
            case 3:
                org.telegram.ui.v70 v70Var = ((org.telegram.ui.t70) this.f29051f).d;
                i11 = ((org.telegram.ui.ActionBar.m2) v70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", v70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.xm0) this.f29051f).f44047a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f29051f;
                i12 = ((org.telegram.ui.ActionBar.m2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public o4(String str, int i10, Object obj) {
        super(str, (z11) null);
        this.f29050e = i10;
        this.f29051f = obj;
    }

    public o4(String str, z11 z11Var) {
        super(str, z11Var);
        this.f29050e = 2;
    }

    public o4(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        super(str, (z11) null);
        this.f29050e = 0;
        this.f29051f = m2Var;
    }
}
