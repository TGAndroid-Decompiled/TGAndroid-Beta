package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class g4 extends p41 {
    public final int f28634e;
    public Object f28635f;

    public g4(Object obj, int i9) {
        super("@stickers", (vz0) null);
        this.f28634e = i9;
        this.f28635f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        int i11;
        switch (this.f28634e) {
            case 0:
                ((org.telegram.ui.ActionBar.o2) this.f28635f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                cx0 cx0Var = (cx0) this.f28635f;
                i9 = ((org.telegram.ui.ActionBar.f3) cx0Var).currentAccount;
                MessagesController.getInstance(i9).openByUserName(getURL(), cx0Var.H, 1);
                cx0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                oc.a0((pf.r) this.f28635f).k(false).j();
                return;
            case 3:
                org.telegram.ui.z60 z60Var = ((org.telegram.ui.x60) this.f28635f).d;
                i10 = ((org.telegram.ui.ActionBar.o2) z60Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName("stickers", z60Var, 1);
                return;
            case 4:
                ((org.telegram.ui.fm0) this.f28635f).f38315a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28635f;
                i11 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public g4(String str, int i9, Object obj) {
        super(str, (vz0) null);
        this.f28634e = i9;
        this.f28635f = obj;
    }

    public g4(String str, vz0 vz0Var) {
        super(str, vz0Var);
        this.f28634e = 2;
    }

    public g4(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        super(str, (vz0) null);
        this.f28634e = 0;
        this.f28635f = o2Var;
    }
}
