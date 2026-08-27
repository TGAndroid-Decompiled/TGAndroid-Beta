package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class ov0 extends qa {
    public fs T;

    public ov0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.A = true;
        this.f31860y = true;
        K();
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new xm(this, 13));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(ov0 ov0Var, int i10) {
        n41 n41VarG = ov0Var.T.G(i10 - 1);
        Object obj = n41VarG != null ? n41VarG.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(ov0Var.currentAccount).openApp(ov0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        fs fsVar = new fs(zk0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.T = fsVar;
        fsVar.f26942r = false;
        return fsVar;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
