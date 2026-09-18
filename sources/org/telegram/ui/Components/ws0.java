package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ws0 implements org.telegram.ui.Cells.m7 {
    public final zu0 f29738a;

    public ws0(zu0 zu0Var) {
        this.f29738a = zu0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        zu0 zu0Var = this.f29738a;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
        if (z10) {
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) o2Var.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
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
        zu0Var.R0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        zu0 zu0Var = this.f29738a;
        vu.J(zu0Var.f30659v1, messageObject, zu0Var.f30650r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f29738a.C1;
    }
}
