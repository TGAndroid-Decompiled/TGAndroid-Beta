package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p10 implements org.telegram.ui.Cells.m7 {
    public final q10 f36369a;

    public p10(q10 q10Var) {
        this.f36369a = q10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        t10 t10Var = this.f36369a.v;
        if (z10) {
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) t10Var.K, (org.telegram.ui.ActionBar.d6) null, false);
            e3Var.fixNavigationBar();
            e3Var.title = str;
            e3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            lg.j jVar = new lg.j(7, this, str);
            e3Var.items = charSequenceArr;
            e3Var.onClickListener = jVar;
            t10Var.L.showDialog(e3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = t10.f37901s0;
        t10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        t10 t10Var = this.f36369a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = t10.f37901s0;
        org.telegram.ui.Components.wu.J(t10Var.L, messageObject, t10Var.f37912g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f36369a.v.f37920o0.g();
    }
}
