package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ew0 extends za {
    public rs X;

    public ew0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f30533y = true;
        K();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new kb0(this, 6));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(ew0 ew0Var, int i10) {
        Object obj;
        i51 G = ew0Var.X.G(i10 - 1);
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
    public final kl0 v(ll0 ll0Var) {
        rs rsVar = new rs(ll0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = rsVar;
        rsVar.f29613r = false;
        return rsVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
