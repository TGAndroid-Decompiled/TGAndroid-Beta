package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class et0 implements org.telegram.ui.Cells.n7 {
    public final iv0 f22756a;

    public et0(iv0 iv0Var) {
        this.f22756a = iv0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        iv0 iv0Var = this.f22756a;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        if (z10) {
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) p2Var.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
            h3Var.fixNavigationBar();
            h3Var.title = str;
            h3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            kg.j jVar = new kg.j(7, this, str);
            h3Var.items = charSequenceArr;
            h3Var.onClickListener = jVar;
            p2Var.showDialog(h3Var);
            return;
        }
        iv0Var.R0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        iv0 iv0Var = this.f22756a;
        zu.J(iv0Var.f24131v1, messageObject, iv0Var.f24122r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f22756a.C1;
    }
}
