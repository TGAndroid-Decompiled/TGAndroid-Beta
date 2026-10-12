package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cf implements Runnable {
    public final int f34922a = 0;
    public final fo f34923b;
    public final MessagesController f34924c;
    public final CharSequence d;
    public final boolean e;

    public cf(fo foVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f34923b = foVar;
        this.d = charSequence;
        this.f34924c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f34922a) {
            case 0:
                fo.o0(this.f34923b, this.d, this.f34924c, this.e);
                return;
            default:
                fo foVar = this.f34923b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.f35932ea);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f34924c;
                alertDialog$Builder.k(string, new da.b(foVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.T = string2;
                foVar.showDialog(a2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public cf(fo foVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f34923b = foVar;
        this.f34924c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
