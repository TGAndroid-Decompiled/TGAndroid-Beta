package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dx0 extends db {
    public et X;

    public dx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f24075y = true;
        L();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new kc0(this, 6));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void Q(dx0 dx0Var, int i10) {
        Object obj;
        m61 G = dx0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(dx0Var.currentAccount).openApp(dx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        et etVar = new et(mm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = etVar;
        etVar.f23145r = false;
        return etVar;
    }
}
