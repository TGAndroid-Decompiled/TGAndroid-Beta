package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ax0 extends bb {
    public at X;

    public ax0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f24887y = true;
        L();
        jm0 jm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new kv(this, 10));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void Q(ax0 ax0Var, int i10) {
        Object obj;
        h61 G = ax0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(ax0Var.currentAccount).openApp(ax0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        at atVar = new at(jm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = atVar;
        atVar.f30861r = false;
        return atVar;
    }
}
