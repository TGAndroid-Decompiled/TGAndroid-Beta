package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class b10 implements org.telegram.ui.Cells.k7 {
    public final c10 f36594a;

    public b10(c10 c10Var) {
        this.f36594a = c10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        f10 f10Var = this.f36594a.v;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(f10Var.G, null, false, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            v vVar = new v(6, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = vVar;
            f10Var.H.showDialog(f3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = f10.f38084o0;
        f10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        f10 f10Var = this.f36594a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = f10.f38084o0;
        org.telegram.ui.Components.gu.I(f10Var.H, messageObject, f10Var.f38090c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean f() {
        return !this.f36594a.v.f38100k0.f();
    }
}
