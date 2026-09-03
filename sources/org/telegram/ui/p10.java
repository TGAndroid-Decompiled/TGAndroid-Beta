package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p10 implements org.telegram.ui.Cells.k7 {
    public final q10 f39852a;

    public p10(q10 q10Var) {
        this.f39852a = q10Var;
    }

    @Override
    public final void a(String str, boolean z4) {
        t10 t10Var = this.f39852a.v;
        if (z4) {
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(t10Var.H, null, false, false);
            h3Var.fixNavigationBar();
            h3Var.title = str;
            h3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            dg.t1 t1Var = new dg.t1(7, this, str);
            h3Var.items = charSequenceArr;
            h3Var.onClickListener = t1Var;
            t10Var.I.showDialog(h3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = t10.f41354p0;
        t10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        t10 t10Var = this.f39852a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = t10.f41354p0;
        org.telegram.ui.Components.ru.I(t10Var.I, messageObject, t10Var.f41361d0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f39852a.v.f41371l0.f();
    }
}
