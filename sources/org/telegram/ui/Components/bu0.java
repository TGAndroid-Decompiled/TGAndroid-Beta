package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bu0 implements org.telegram.ui.Cells.q7 {
    public final aw0 f26965a;

    public bu0(aw0 aw0Var) {
        this.f26965a = aw0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        aw0 aw0Var = this.f26965a;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26702x1;
        if (z10) {
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) r2Var.getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
            k3Var.fixNavigationBar();
            k3Var.title = str;
            k3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            ng.j jVar = new ng.j(6, this, str);
            k3Var.items = charSequenceArr;
            k3Var.onClickListener = jVar;
            r2Var.showDialog(k3Var);
            return;
        }
        aw0Var.X0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        aw0 aw0Var = this.f26965a;
        dv.I(aw0Var.f26702x1, messageObject, aw0Var.f26692t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f26965a.E1;
    }
}
