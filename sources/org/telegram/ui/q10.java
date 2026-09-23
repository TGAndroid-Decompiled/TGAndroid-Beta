package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q10 implements org.telegram.ui.Cells.m7 {
    public final r10 f36239a;

    public q10(r10 r10Var) {
        this.f36239a = r10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        u10 u10Var = this.f36239a.v;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) u10Var.K, (org.telegram.ui.ActionBar.d6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            lg.j jVar = new lg.j(7, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = jVar;
            u10Var.L.showDialog(f3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = u10.f37843s0;
        u10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        u10 u10Var = this.f36239a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = u10.f37843s0;
        org.telegram.ui.Components.wu.J(u10Var.L, messageObject, u10Var.f37854g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f36239a.v.f37862o0.g();
    }
}
