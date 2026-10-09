package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class o4 extends t61 {
    public final int f29383e;
    public Object f29384f;

    public o4(Object obj, int i10) {
        super("@stickers", (t11) null);
        this.f29383e = i10;
        this.f29384f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.f29383e) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f29384f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                xy0 xy0Var = (xy0) this.f29384f;
                i10 = ((org.telegram.ui.ActionBar.f3) xy0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), xy0Var.L, 1);
                xy0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                ad.a0((hg.w) this.f29384f).k(false).j();
                return;
            case 3:
                org.telegram.ui.s70 s70Var = ((org.telegram.ui.q70) this.f29384f).d;
                i11 = ((org.telegram.ui.ActionBar.n2) s70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", s70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.vm0) this.f29384f).f42903a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f29384f;
                i12 = ((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public o4(String str, int i10, Object obj) {
        super(str, (t11) null);
        this.f29383e = i10;
        this.f29384f = obj;
    }

    public o4(String str, t11 t11Var) {
        super(str, t11Var);
        this.f29383e = 2;
    }

    public o4(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        super(str, (t11) null);
        this.f29383e = 0;
        this.f29384f = n2Var;
    }
}
