package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class cs0 implements org.telegram.ui.Cells.h7 {

    public final hu0 f27537a;

    public cs0(hu0 hu0Var) {
        this.f27537a = hu0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        hu0 hu0Var = this.f27537a;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        if (!z10) {
            hu0Var.R0(str);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(n2Var.getParentActivity(), null, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
        org.telegram.ui.w wVar = new org.telegram.ui.w(5, this, str);
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = wVar;
        n2Var.showDialog(e3Var);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        hu0 hu0Var = this.f27537a;
        fu.J(hu0Var.f29145r1, messageObject, hu0Var.f29136n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f27537a.f29163y1;
    }
}
