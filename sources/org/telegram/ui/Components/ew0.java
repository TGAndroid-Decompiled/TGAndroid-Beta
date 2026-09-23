package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ew0 extends bb {
    public ss X;

    public ew0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f22666y = true;
        K();
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new kg0(this, 5));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(ew0 ew0Var, int i10) {
        Object obj;
        h51 G = ew0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(ew0Var.currentAccount).openApp(ew0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        ss ssVar = new ss(ml0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = ssVar;
        ssVar.f28662r = false;
        return ssVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
