package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gw0 extends sa {
    public rs U;

    public gw0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.B = true;
        this.f31022y = true;
        J();
        tl0 tl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new nb0(this, 6));
        this.d.setOnItemClickListener(new k(this, 14));
    }

    public static void P(gw0 gw0Var, int i10) {
        Object obj;
        j51 G = gw0Var.U.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(gw0Var.currentAccount).openApp(gw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        rs rsVar = new rs(tl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.U = rsVar;
        rsVar.f32957r = false;
        return rsVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
