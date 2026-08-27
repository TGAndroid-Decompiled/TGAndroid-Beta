package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ne implements Runnable {

    public final int f40807a = 0;

    public final rn f40808b;

    public final MessagesController f40809c;
    public final CharSequence d;

    public final boolean f40810e;

    public ne(rn rnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f40808b = rnVar;
        this.d = charSequence;
        this.f40809c = messagesController;
        this.f40810e = z10;
    }

    @Override
    public final void run() {
        switch (this.f40807a) {
            case 0:
                rn.k0(this.f40808b, this.d, this.f40809c, this.f40810e);
                break;
            default:
                rn rnVar = this.f40808b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.f41983aa);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f40809c;
                alertDialog$Builder.k(string, new l9.b(rnVar, messagesController, this.d, this.f40810e, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.P = string2;
                rnVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public ne(rn rnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f40808b = rnVar;
        this.f40809c = messagesController;
        this.d = charSequence;
        this.f40810e = z10;
    }
}
