package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class f10 implements org.telegram.ui.Cells.q7 {
    public final g10 f39122a;

    public f10(g10 g10Var) {
        this.f39122a = g10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        j10 j10Var = this.f39122a.v;
        if (z10) {
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) j10Var.K, (org.telegram.ui.ActionBar.u6) null, false);
            k3Var.fixNavigationBar();
            k3Var.title = str;
            k3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            ng.j jVar = new ng.j(7, this, str);
            k3Var.items = charSequenceArr;
            k3Var.onClickListener = jVar;
            j10Var.L.showDialog(k3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = j10.f40319s0;
        j10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        j10 j10Var = this.f39122a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = j10.f40319s0;
        org.telegram.ui.Components.dv.I(j10Var.L, messageObject, j10Var.f40330g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f39122a.v.f40338o0.g();
    }
}
