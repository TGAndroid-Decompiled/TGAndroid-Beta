package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cx0 extends za {
    public ys X;

    public cx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f33217y = true;
        K();
        lm0 lm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new iv(this, 10));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(cx0 cx0Var, int i10) {
        Object obj;
        l61 G = cx0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(cx0Var.currentAccount).openApp(cx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        ys ysVar = new ys(lm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = ysVar;
        ysVar.f24646r = false;
        return ysVar;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
