package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cu0 implements org.telegram.ui.Cells.q7 {
    public final bw0 f27257a;

    public cu0(bw0 bw0Var) {
        this.f27257a = bw0Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        bw0 bw0Var = this.f27257a;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
        if (z10) {
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) r2Var.getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
            k3Var.fixNavigationBar();
            k3Var.title = str;
            k3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            ng.j jVar = new ng.j(6, this, str);
            k3Var.items = charSequenceArr;
            k3Var.onClickListener = jVar;
            r2Var.showDialog(k3Var);
            return;
        }
        bw0Var.X0(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        bw0 bw0Var = this.f27257a;
        dv.I(bw0Var.f26992x1, messageObject, bw0Var.f26982t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f27257a.E1;
    }
}
