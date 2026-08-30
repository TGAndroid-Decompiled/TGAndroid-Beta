package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p10 implements org.telegram.ui.Cells.k7 {
    public final q10 f37150a;

    public p10(q10 q10Var) {
        this.f37150a = q10Var;
    }

    @Override
    public final void a(String str, boolean z4) {
        t10 t10Var = this.f37150a.v;
        if (z4) {
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(t10Var.H, null, false, false);
            g3Var.fixNavigationBar();
            g3Var.title = str;
            g3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            cg.u1 u1Var = new cg.u1(7, this, str);
            g3Var.items = charSequenceArr;
            g3Var.onClickListener = u1Var;
            t10Var.I.showDialog(g3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = t10.f38471p0;
        t10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        t10 t10Var = this.f37150a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = t10.f38471p0;
        org.telegram.ui.Components.pu.I(t10Var.I, messageObject, t10Var.f38478d0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f37150a.v.f38487l0.f();
    }
}
