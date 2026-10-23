package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class e10 implements org.telegram.ui.Cells.m7 {
    public final f10 f36785a;

    public e10(f10 f10Var) {
        this.f36785a = f10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        i10 i10Var = this.f36785a.v;
        if (z10) {
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) i10Var.K, (org.telegram.ui.ActionBar.g6) null, false);
            h3Var.fixNavigationBar();
            h3Var.title = str;
            h3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            mg.j jVar = new mg.j(7, this, str);
            h3Var.items = charSequenceArr;
            h3Var.onClickListener = jVar;
            i10Var.L.showDialog(h3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = i10.f38009s0;
        i10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        i10 i10Var = this.f36785a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = i10.f38009s0;
        org.telegram.ui.Components.cv.I(i10Var.L, messageObject, i10Var.f38020g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f36785a.v.f38028o0.g();
    }
}
