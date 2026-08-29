package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ms0 implements org.telegram.ui.Cells.i7 {
    public final qu0 f30760a;

    public ms0(qu0 qu0Var) {
        this.f30760a = qu0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        qu0 qu0Var = this.f30760a;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(o2Var.getParentActivity(), null, false, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            ag.y1 y1Var = new ag.y1(6, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = y1Var;
            o2Var.showDialog(f3Var);
            return;
        }
        qu0Var.R0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        qu0 qu0Var = this.f30760a;
        mu.I(qu0Var.f32093r1, messageObject, qu0Var.f32084n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f30760a.f32111y1;
    }
}
