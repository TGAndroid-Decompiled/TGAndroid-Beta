package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bs0 implements org.telegram.ui.Cells.k7 {
    public final eu0 f27271a;

    public bs0(eu0 eu0Var) {
        this.f27271a = eu0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        eu0 eu0Var = this.f27271a;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(o2Var.getParentActivity(), null, false, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            org.telegram.ui.v vVar = new org.telegram.ui.v(5, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = vVar;
            o2Var.showDialog(f3Var);
            return;
        }
        eu0Var.R0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        eu0 eu0Var = this.f27271a;
        gu.I(eu0Var.f28160r1, messageObject, eu0Var.f28151n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean f() {
        return !this.f27271a.f28178y1;
    }
}
