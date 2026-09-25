package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pw0 extends bb {
    public ss X;

    public pw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f22963y = true;
        K();
        wl0 wl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new ug0(this, 5));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(pw0 pw0Var, int i10) {
        Object obj;
        v51 G = pw0Var.X.G(i10 - 1);
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
    public final vl0 v(wl0 wl0Var) {
        ss ssVar = new ss(wl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = ssVar;
        ssVar.f25291r = false;
        return ssVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
