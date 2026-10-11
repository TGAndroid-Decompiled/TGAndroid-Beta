package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class o4 extends v61 {
    public final int f29252e;
    public Object f29253f;

    public o4(Object obj, int i10) {
        super("@stickers", (v11) null);
        this.f29252e = i10;
        this.f29253f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f29252e) {
            case 0:
                ((org.telegram.ui.ActionBar.m2) this.f29253f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                zy0 zy0Var = (zy0) this.f29253f;
                i10 = ((org.telegram.ui.ActionBar.e3) zy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), zy0Var.L, 1);
                zy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                ad.a0((hg.w) this.f29253f).k(false).j();
                return;
            case 3:
                org.telegram.ui.s70 s70Var = ((org.telegram.ui.q70) this.f29253f).d;
                i11 = ((org.telegram.ui.ActionBar.m2) s70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", s70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.um0) this.f29253f).f42650a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f29253f;
                i12 = ((org.telegram.ui.ActionBar.m2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public o4(String str, int i10, Object obj) {
        super(str, (v11) null);
        this.f29252e = i10;
        this.f29253f = obj;
    }

    public o4(String str, v11 v11Var) {
        super(str, v11Var);
        this.f29252e = 2;
    }

    public o4(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        super(str, (v11) null);
        this.f29252e = 0;
        this.f29253f = m2Var;
    }
}
