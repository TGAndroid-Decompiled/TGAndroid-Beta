package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mv0 extends sa {
    public hs T;

    public mv0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.A = true;
        this.f32415y = true;
        J();
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, 0);
        this.d.j(new kn(this, 12));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void O(mv0 mv0Var, int i9) {
        Object obj;
        l41 G = mv0Var.T.G(i9 - 1);
        if (G != null) {
            obj = G.G;
        } else {
            obj = null;
        }
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(mv0Var.currentAccount).openApp(mv0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        hs hsVar = new hs(wk0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.T = hsVar;
        hsVar.f35188r = false;
        return hsVar;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
