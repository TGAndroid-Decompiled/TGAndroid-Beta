package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class us0 implements org.telegram.ui.Cells.k7 {
    public final yu0 f29279a;

    public us0(yu0 yu0Var) {
        this.f29279a = yu0Var;
    }

    @Override
    public final void a(String str, boolean z4) {
        yu0 yu0Var = this.f29279a;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31144s1;
        if (z4) {
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(p2Var.getParentActivity(), null, false, false);
            g3Var.fixNavigationBar();
            g3Var.title = str;
            g3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            cg.u1 u1Var = new cg.u1(6, this, str);
            g3Var.items = charSequenceArr;
            g3Var.onClickListener = u1Var;
            p2Var.showDialog(g3Var);
            return;
        }
        yu0Var.R0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        yu0 yu0Var = this.f29279a;
        pu.I(yu0Var.f31144s1, messageObject, yu0Var.f31134o1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f29279a.f31161z1;
    }
}
