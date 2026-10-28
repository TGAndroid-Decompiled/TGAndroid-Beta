package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lx0 extends bb {
    public ct X;

    public lx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f26798y = true;
        K();
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new ml(this, 15));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(lx0 lx0Var, int i10) {
        Object obj;
        u61 G = lx0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(lx0Var.currentAccount).openApp(lx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        ct ctVar = new ct(nm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = ctVar;
        ctVar.f29878r = false;
        return ctVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
