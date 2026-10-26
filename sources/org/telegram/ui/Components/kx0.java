package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class kx0 extends bb {
    public ct X;

    public kx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f26816y = true;
        K();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new ml(this, 15));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(kx0 kx0Var, int i10) {
        Object obj;
        t61 G = kx0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(kx0Var.currentAccount).openApp(kx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        ct ctVar = new ct(mm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = ctVar;
        ctVar.f29507r = false;
        return ctVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
