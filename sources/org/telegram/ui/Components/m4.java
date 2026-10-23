package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.StickersActivity;
public final class m4 extends q61 {
    public final int e;
    public Object f28499f;

    public m4(Object obj, int i10) {
        super("@stickers", (q11) null);
        this.e = i10;
        this.f28499f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.o2) this.f28499f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                ty0 ty0Var = (ty0) this.f28499f;
                i10 = ((org.telegram.ui.ActionBar.h3) ty0Var).currentAccount;
                MessagesController.getInstance(i10).openByUserName(getURL(), ty0Var.L, 1);
                ty0Var.dismiss();
                return;
            case 2:
                AndroidUtilities.addToClipboard(getURL());
                xc.a0((ig.v) this.f28499f).k(false).j();
                return;
            case 3:
                org.telegram.ui.e70 e70Var = ((org.telegram.ui.c70) this.f28499f).d;
                i11 = ((org.telegram.ui.ActionBar.o2) e70Var).currentAccount;
                MessagesController.getInstance(i11).openByUserName("stickers", e70Var, 1);
                return;
            case 4:
                ((org.telegram.ui.im0) this.f28499f).f38269a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f28499f;
                i12 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
                MessagesController.getInstance(i12).openByUserName("stickers", stickersActivity, 3);
                return;
        }
    }

    public m4(String str, int i10, Object obj) {
        super(str, (q11) null);
        this.e = i10;
        this.f28499f = obj;
    }

    public m4(String str, q11 q11Var) {
        super(str, q11Var);
        this.e = 2;
    }

    public m4(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        super(str, (q11) null);
        this.e = 0;
        this.f28499f = o2Var;
    }
}
