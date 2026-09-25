package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gt0 implements org.telegram.ui.Cells.m7 {
    public final jv0 f24531a;

    public gt0(jv0 jv0Var) {
        this.f24531a = jv0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        jv0 jv0Var = this.f24531a;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25560v1;
        if (z10) {
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) m2Var.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
            e3Var.fixNavigationBar();
            e3Var.title = str;
            e3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            lg.j jVar = new lg.j(6, this, str);
            e3Var.items = charSequenceArr;
            e3Var.onClickListener = jVar;
            m2Var.showDialog(e3Var);
            return;
        }
        jv0Var.R0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        jv0 jv0Var = this.f24531a;
        wu.J(jv0Var.f25560v1, messageObject, jv0Var.f25551r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f24531a.C1;
    }
}
