package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class nx0 extends db {
    public kt X;

    public nx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.f25302y = true;
        L();
        wm0 wm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new qh0(this, 5));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void Q(nx0 nx0Var, int i10) {
        Object obj;
        u61 G = nx0Var.X.G(i10 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(nx0Var.currentAccount).openApp(nx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        kt ktVar = new kt(wm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = ktVar;
        ktVar.f26675r = false;
        return ktVar;
    }
}
