package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fw0 extends sa {
    public ps U;

    public fw0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.B = true;
        this.f28683y = true;
        J();
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new lb0(this, 6));
        this.d.setOnItemClickListener(new k(this, 14));
    }

    public static void P(fw0 fw0Var, int i10) {
        Object obj;
        i51 G = fw0Var.U.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(fw0Var.currentAccount).openApp(fw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        ps psVar = new ps(sl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.U = psVar;
        psVar.f30240r = false;
        return psVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
