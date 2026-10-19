package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tr0 implements Runnable {
    public final int f30663a = 0;
    public final tv0 f30664b;
    public final org.telegram.ui.ActionBar.d6 f30665c;
    public final MessageObject d;
    public final int e;

    public tr0(tv0 tv0Var, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject) {
        this.f30664b = tv0Var;
        this.f30665c = d6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f30663a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f30664b.getContext(), 3, this.f30665c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new vs(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new yr0(b2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                tv0 tv0Var = this.f30664b;
                Context context = tv0Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f30665c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.fa(tv0Var, d6Var, messageObject, this.e, 4));
                i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public tr0(tv0 tv0Var, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f30664b = tv0Var;
        this.f30665c = d6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
