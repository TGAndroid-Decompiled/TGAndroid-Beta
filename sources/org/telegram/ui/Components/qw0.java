package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qw0 extends bb {
    public ts X;

    public qw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f22963y = true;
        K();
        xl0 xl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        xl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new vg0(this, 5));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(qw0 qw0Var, int i10) {
        Object obj;
        w51 G = qw0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(qw0Var.currentAccount).openApp(qw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final wl0 v(xl0 xl0Var) {
        ts tsVar = new ts(xl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = tsVar;
        tsVar.f25644r = false;
        return tsVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
