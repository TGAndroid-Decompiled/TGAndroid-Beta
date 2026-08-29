package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class le implements Runnable {
    public final int f40179a = 0;
    public final tn f40180b;
    public final MessagesController f40181c;
    public final CharSequence d;
    public final boolean f40182e;

    public le(tn tnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f40180b = tnVar;
        this.d = charSequence;
        this.f40181c = messagesController;
        this.f40182e = z10;
    }

    @Override
    public final void run() {
        switch (this.f40179a) {
            case 0:
                tn.k0(this.f40180b, this.d, this.f40181c, this.f40182e);
                return;
            default:
                tn tnVar = this.f40180b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.f42746aa);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f40181c;
                alertDialog$Builder.k(string, new m9.b(tnVar, messagesController, this.d, this.f40182e, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.P = string2;
                tnVar.showDialog(c2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public le(tn tnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f40180b = tnVar;
        this.f40181c = messagesController;
        this.d = charSequence;
        this.f40182e = z10;
    }
}
