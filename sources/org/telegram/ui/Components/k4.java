package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class k4 extends a51 {
    public final int f29916e;
    public Object f29917f;

    public k4(Object obj, int i10) {
        super("@stickers", (h01) null);
        this.f29916e = i10;
        this.f29917f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f29916e) {
            case 0:
                ((org.telegram.ui.ActionBar.o2) this.f29917f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                nx0 nx0Var = (nx0) this.f29917f;
                i10 = ((org.telegram.ui.ActionBar.f3) nx0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), nx0Var.H, 1);
                nx0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                tc.a0((sf.r) this.f29917f).k(false).j();
                return;
            case 3:
                org.telegram.ui.c70 c70Var = ((org.telegram.ui.a70) this.f29917f).d;
                i11 = ((org.telegram.ui.ActionBar.o2) c70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", c70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.dm0) this.f29917f).f37561a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f29917f;
                i12 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public k4(String str, int i10, Object obj) {
        super(str, (h01) null);
        this.f29916e = i10;
        this.f29917f = obj;
    }

    public k4(String str, h01 h01Var) {
        super(str, h01Var);
        this.f29916e = 2;
    }

    public k4(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        super(str, (h01) null);
        this.f29916e = 0;
        this.f29917f = o2Var;
    }
}
