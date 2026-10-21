package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class a10 implements org.telegram.ui.Cells.l7 {
    public final b10 f35242a;

    public a10(b10 b10Var) {
        this.f35242a = b10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        e10 e10Var = this.f35242a.v;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) e10Var.K, (org.telegram.ui.ActionBar.d6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            mg.j jVar = new mg.j(7, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = jVar;
            e10Var.L.showDialog(f3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = e10.f36491s0;
        e10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        e10 e10Var = this.f35242a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = e10.f36491s0;
        org.telegram.ui.Components.cv.J(e10Var.L, messageObject, e10Var.f36502g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f35242a.v.f36510o0.g();
    }
}
