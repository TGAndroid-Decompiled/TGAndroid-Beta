package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jx0 extends db {
    public jt X;

    public jx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f25528y = true;
        L();
        sm0 sm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new oh0(this, 5));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void Q(jx0 jx0Var, int i10) {
        Object obj;
        r61 G = jx0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(jx0Var.currentAccount).openApp(jx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        jt jtVar = new jt(sm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = jtVar;
        jtVar.f25890r = false;
        return jtVar;
    }
}
