package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class gq0 implements Runnable {

    public final int f28797a = 0;

    public final hu0 f28798b;

    public final org.telegram.ui.ActionBar.c6 f28799c;
    public final MessageObject d;

    public final int f28800e;

    public gq0(hu0 hu0Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject) {
        this.f28798b = hu0Var;
        this.f28799c = c6Var;
        this.f28800e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f28797a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f28798b.getContext(), 3, this.f28799c)};
                int i10 = this.f28800e;
                int iSendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new as(b2VarArr, 1));
                if (iSendVote != 0) {
                    AndroidUtilities.runOnUIThread(new lq0(b2VarArr, i10, iSendVote, 0), 500L);
                }
                break;
            default:
                hu0 hu0Var = this.f28798b;
                Context context = hu0Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.f28799c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.L0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.N = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.P = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.N = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.P = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new cg.a0(hu0Var, c6Var, messageObject, this.f28800e, 6));
                i0.a.w(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public gq0(hu0 hu0Var, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.f28798b = hu0Var;
        this.f28799c = c6Var;
        this.d = messageObject;
        this.f28800e = i10;
    }
}
