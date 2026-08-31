package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vs0 implements org.telegram.ui.Cells.k7 {
    public final zu0 f32534a;

    public vs0(zu0 zu0Var) {
        this.f32534a = zu0Var;
    }

    @Override
    public final void a(String str, boolean z4) {
        zu0 zu0Var = this.f32534a;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        if (z4) {
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(p2Var.getParentActivity(), null, false, false);
            h3Var.fixNavigationBar();
            h3Var.title = str;
            h3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            dg.t1 t1Var = new dg.t1(6, this, str);
            h3Var.items = charSequenceArr;
            h3Var.onClickListener = t1Var;
            p2Var.showDialog(h3Var);
            return;
        }
        zu0Var.R0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        zu0 zu0Var = this.f32534a;
        ru.I(zu0Var.f34004s1, messageObject, zu0Var.f33994o1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f32534a.f34021z1;
    }
}
