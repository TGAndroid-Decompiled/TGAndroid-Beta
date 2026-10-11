package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ix0 extends db {
    public jt X;

    public ix0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f25741y = true;
        L();
        rm0 rm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new nh0(this, 5));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void Q(ix0 ix0Var, int i10) {
        Object obj;
        q61 G = ix0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(ix0Var.currentAccount).openApp(ix0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        jt jtVar = new jt(rm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = jtVar;
        jtVar.f25649r = false;
        return jtVar;
    }
}
