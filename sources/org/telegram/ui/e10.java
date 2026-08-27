package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class e10 implements org.telegram.ui.Cells.h7 {

    public final f10 f37592a;

    public e10(f10 f10Var) {
        this.f37592a = f10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        i10 i10Var = this.f37592a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = i10.f38933o0;
            i10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(i10Var.G, null, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        w wVar = new w(6, this, str);
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = wVar;
        i10Var.H.showDialog(e3Var);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        i10 i10Var = this.f37592a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = i10.f38933o0;
        org.telegram.ui.Components.fu.J(i10Var.H, messageObject, i10Var.f38939c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f37592a.v.f38949k0.f();
    }
}
