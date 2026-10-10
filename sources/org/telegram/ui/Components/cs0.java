package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cs0 implements Runnable {
    public final int f25403a = 0;
    public final cw0 f25404b;
    public final org.telegram.ui.ActionBar.e6 f25405c;
    public final MessageObject d;
    public final int f25406e;

    public cs0(cw0 cw0Var, org.telegram.ui.ActionBar.e6 e6Var, int i10, MessageObject messageObject) {
        this.f25404b = cw0Var;
        this.f25405c = e6Var;
        this.f25406e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25403a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f25404b.getContext(), 3, this.f25405c)};
                int i10 = this.f25406e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ct(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new hs0(b2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                cw0 cw0Var = this.f25404b;
                Context context = cw0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f25405c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.ea(cw0Var, e6Var, messageObject, this.f25406e, 4));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public cs0(cw0 cw0Var, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f25404b = cw0Var;
        this.f25405c = e6Var;
        this.d = messageObject;
        this.f25406e = i10;
    }
}
