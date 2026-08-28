package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ne implements Runnable {
    public final int f40703a = 0;
    public final qn f40704b;
    public final MessagesController f40705c;
    public final CharSequence d;
    public final boolean f40706e;

    public ne(qn qnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f40704b = qnVar;
        this.d = charSequence;
        this.f40705c = messagesController;
        this.f40706e = z10;
    }

    @Override
    public final void run() {
        switch (this.f40703a) {
            case 0:
                qn.j0(this.f40704b, this.d, this.f40705c, this.f40706e);
                return;
            default:
                qn qnVar = this.f40704b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f41848aa);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f40705c;
                alertDialog$Builder.k(string, new k9.b(qnVar, messagesController, this.d, this.f40706e, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.P = string2;
                qnVar.showDialog(c2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ne(qn qnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f40704b = qnVar;
        this.f40705c = messagesController;
        this.d = charSequence;
        this.f40706e = z10;
    }
}
