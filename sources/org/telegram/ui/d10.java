package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d10 implements org.telegram.ui.Cells.i7 {
    public final e10 f37268a;

    public d10(e10 e10Var) {
        this.f37268a = e10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        h10 h10Var = this.f37268a.v;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(h10Var.G, null, false, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            ag.y1 y1Var = new ag.y1(7, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = y1Var;
            h10Var.H.showDialog(f3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = h10.f38717o0;
        h10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        h10 h10Var = this.f37268a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = h10.f38717o0;
        org.telegram.ui.Components.mu.I(h10Var.H, messageObject, h10Var.f38723c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f37268a.v.f38733k0.f();
    }
}
