package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class it0 implements org.telegram.ui.Cells.m7 {
    public final lv0 f25227a;

    public it0(lv0 lv0Var) {
        this.f25227a = lv0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        lv0 lv0Var = this.f25227a;
        org.telegram.ui.ActionBar.o2 o2Var = lv0Var.f26212v1;
        if (z10) {
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) o2Var.getParentActivity(), (org.telegram.ui.ActionBar.e6) null, false);
            g3Var.fixNavigationBar();
            g3Var.title = str;
            g3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            lg.j jVar = new lg.j(6, this, str);
            g3Var.items = charSequenceArr;
            g3Var.onClickListener = jVar;
            o2Var.showDialog(g3Var);
            return;
        }
        lv0Var.R0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        lv0 lv0Var = this.f25227a;
        xu.J(lv0Var.f26212v1, messageObject, lv0Var.f26203r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f25227a.C1;
    }
}
