package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pw0 extends ab {
    public xs X;

    public pw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f21457y = true;
        K();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new al0(this, 3));
        this.d.setOnItemClickListener(new k(this, 14));
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
    public final ul0 v(vl0 vl0Var) {
        xs xsVar = new xs(vl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = xsVar;
        xsVar.f24250r = false;
        return xsVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
