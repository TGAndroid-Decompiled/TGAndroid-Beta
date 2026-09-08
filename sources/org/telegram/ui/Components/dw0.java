package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dw0 extends bb {
    public qs X;

    public dw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f24681y = true;
        K();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new lb0(this, 6));
        this.d.setOnItemClickListener(new k(this, 14));
    }

    public static void P(dw0 dw0Var, int i10) {
        Object obj;
        h51 G = dw0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(dw0Var.currentAccount).openApp(dw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        qs qsVar = new qs(ll0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = qsVar;
        qsVar.f31162r = false;
        return qsVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
