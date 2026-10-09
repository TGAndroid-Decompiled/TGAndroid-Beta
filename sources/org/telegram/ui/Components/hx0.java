package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hx0 extends eb {
    public ht X;

    public hx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f26030y = true;
        L();
        qm0 qm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new mh0(this, 5));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void Q(hx0 hx0Var, int i10) {
        Object obj;
        p61 G = hx0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(hx0Var.currentAccount).openApp(hx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        ht htVar = new ht(qm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = htVar;
        htVar.f25280r = false;
        return htVar;
    }
}
