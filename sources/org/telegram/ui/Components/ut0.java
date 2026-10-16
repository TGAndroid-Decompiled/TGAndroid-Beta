package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ut0 implements org.telegram.ui.Cells.m7 {
    public final xv0 f29437a;

    public ut0(xv0 xv0Var) {
        this.f29437a = xv0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        xv0 xv0Var = this.f29437a;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31069v1;
        if (z10) {
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) m2Var.getParentActivity(), (org.telegram.ui.ActionBar.c6) null, false);
            e3Var.fixNavigationBar();
            e3Var.title = str;
            e3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            mg.j jVar = new mg.j(6, this, str);
            e3Var.items = charSequenceArr;
            e3Var.onClickListener = jVar;
            m2Var.showDialog(e3Var);
            return;
        }
        xv0Var.S0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        xv0 xv0Var = this.f29437a;
        hv.J(xv0Var.f31069v1, messageObject, xv0Var.f31060r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f29437a.C1;
    }
}
