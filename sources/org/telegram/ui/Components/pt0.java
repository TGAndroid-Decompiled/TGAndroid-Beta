package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pt0 implements org.telegram.ui.Cells.l7 {
    public final sv0 f29430a;

    public pt0(sv0 sv0Var) {
        this.f29430a = sv0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        sv0 sv0Var = this.f29430a;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) n2Var.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            mg.j jVar = new mg.j(6, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = jVar;
            n2Var.showDialog(f3Var);
            return;
        }
        sv0Var.T0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        sv0 sv0Var = this.f29430a;
        cv.J(sv0Var.f30388v1, messageObject, sv0Var.f30379r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f29430a.C1;
    }
}
