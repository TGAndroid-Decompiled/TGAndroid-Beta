package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fq0 implements Runnable {
    public final int f28552a = 0;
    public final eu0 f28553b;
    public final org.telegram.ui.ActionBar.b6 f28554c;
    public final MessageObject d;
    public final int f28555e;

    public fq0(eu0 eu0Var, org.telegram.ui.ActionBar.b6 b6Var, int i9, MessageObject messageObject) {
        this.f28553b = eu0Var;
        this.f28554c = b6Var;
        this.f28555e = i9;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f28552a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(this.f28553b.getContext(), 3, this.f28554c)};
                int i9 = this.f28555e;
                int sendVote = SendMessagesHelper.getInstance(i9).sendVote(this.d, null, new cs(c2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new kq0(c2VarArr, i9, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                eu0 eu0Var = this.f28553b;
                Context context = eu0Var.getContext();
                org.telegram.ui.ActionBar.b6 b6Var = this.f28554c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.L0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    c2Var.N = LocaleController.getString(R.string.StopQuizAlertTitle);
                    c2Var.P = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    c2Var.N = LocaleController.getString(R.string.StopPollAlertTitle);
                    c2Var.P = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new bg.d0(eu0Var, b6Var, messageObject, this.f28555e, 6));
                j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public fq0(eu0 eu0Var, org.telegram.ui.ActionBar.b6 b6Var, MessageObject messageObject, int i9) {
        this.f28553b = eu0Var;
        this.f28554c = b6Var;
        this.d = messageObject;
        this.f28555e = i9;
    }
}
