package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d10 implements org.telegram.ui.Cells.q7 {
    public final e10 f38707a;

    public d10(e10 e10Var) {
        this.f38707a = e10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        h10 h10Var = this.f38707a.v;
        if (z10) {
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) h10Var.K, (org.telegram.ui.ActionBar.u6) null, false);
            k3Var.fixNavigationBar();
            k3Var.title = str;
            k3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            ng.j jVar = new ng.j(7, this, str);
            k3Var.items = charSequenceArr;
            k3Var.onClickListener = jVar;
            h10Var.L.showDialog(k3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = h10.f39822s0;
        h10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        h10 h10Var = this.f38707a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = h10.f39822s0;
        org.telegram.ui.Components.dv.I(h10Var.L, messageObject, h10Var.f39833g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f38707a.v.f39841o0.g();
    }
}
