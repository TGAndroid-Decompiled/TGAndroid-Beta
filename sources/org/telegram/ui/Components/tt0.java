package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tt0 implements org.telegram.ui.Cells.m7 {
    public final wv0 f30886a;

    public tt0(wv0 wv0Var) {
        this.f30886a = wv0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        wv0 wv0Var = this.f30886a;
        org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
        if (z10) {
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) o2Var.getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
            h3Var.fixNavigationBar();
            h3Var.title = str;
            h3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            mg.j jVar = new mg.j(6, this, str);
            h3Var.items = charSequenceArr;
            h3Var.onClickListener = jVar;
            o2Var.showDialog(h3Var);
            return;
        }
        wv0Var.U0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        wv0 wv0Var = this.f30886a;
        av.I(wv0Var.f32410v1, messageObject, wv0Var.f32401r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f30886a.C1;
    }
}
