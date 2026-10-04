package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mt0 implements org.telegram.ui.Cells.m7 {
    public final pv0 f28709a;

    public mt0(pv0 pv0Var) {
        this.f28709a = pv0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        pv0 pv0Var = this.f28709a;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29806v1;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) n2Var.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            lg.j jVar = new lg.j(6, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = jVar;
            n2Var.showDialog(f3Var);
            return;
        }
        pv0Var.R0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        pv0 pv0Var = this.f28709a;
        zu.H(pv0Var.f29806v1, messageObject, pv0Var.f29797r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f28709a.C1;
    }
}
