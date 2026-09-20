package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pw0 extends ab {
    public rs X;

    public pw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f22643y = true;
        K();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new sb0(this, 7));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(pw0 pw0Var, int i10) {
        Object obj;
        w51 G = pw0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(pw0Var.currentAccount).openApp(pw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        rs rsVar = new rs(vl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = rsVar;
        rsVar.f25678r = false;
        return rsVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
