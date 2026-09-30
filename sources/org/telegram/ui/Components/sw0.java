package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sw0 extends cb {
    public us X;

    public sw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f23246y = true;
        K();
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new xg0(this, 5));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(sw0 sw0Var, int i10) {
        Object obj;
        y51 G = sw0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(sw0Var.currentAccount).openApp(sw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        us usVar = new us(zl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = usVar;
        usVar.f26223r = false;
        return usVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
