package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class af implements Runnable {
    public final int f35778a = 0;
    public final eo f35779b;
    public final MessagesController f35780c;
    public final CharSequence d;
    public final boolean f35781e;

    public af(eo eoVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f35779b = eoVar;
        this.d = charSequence;
        this.f35780c = messagesController;
        this.f35781e = z10;
    }

    @Override
    public final void run() {
        switch (this.f35778a) {
            case 0:
                eo.o0(this.f35779b, this.d, this.f35780c, this.f35781e);
                return;
            default:
                eo eoVar = this.f35779b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f37256ea);
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f35780c;
                alertDialog$Builder.k(string, new ca.b(eoVar, messagesController, this.d, this.f35781e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                a2Var.T = string2;
                eoVar.showDialog(a2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public af(eo eoVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f35779b = eoVar;
        this.f35780c = messagesController;
        this.d = charSequence;
        this.f35781e = z10;
    }
}
