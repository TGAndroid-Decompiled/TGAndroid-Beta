package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fw0 extends sa {
    public rs U;

    public fw0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.B = true;
        this.f31022y = true;
        J();
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new nb0(this, 6));
        this.d.setOnItemClickListener(new k(this, 14));
    }

    public static void P(fw0 fw0Var, int i10) {
        Object obj;
        h51 G = fw0Var.U.G(i10 - 1);
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
        rs rsVar = new rs(sl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.U = rsVar;
        rsVar.f32651r = false;
        return rsVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
