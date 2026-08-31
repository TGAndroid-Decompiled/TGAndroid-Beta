package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ar0 implements Runnable {
    public final int f25329a = 0;
    public final zu0 f25330b;
    public final org.telegram.ui.ActionBar.g6 f25331c;
    public final MessageObject d;
    public final int f25332e;

    public ar0(zu0 zu0Var, org.telegram.ui.ActionBar.g6 g6Var, int i10, MessageObject messageObject) {
        this.f25330b = zu0Var;
        this.f25331c = g6Var;
        this.f25332e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25329a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(this.f25330b.getContext(), 3, this.f25331c)};
                int i10 = this.f25332e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ms(d2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new er0(d2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                zu0 zu0Var = this.f25330b;
                Context context = zu0Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var = this.f25331c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.M0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    d2Var.O = LocaleController.getString(R.string.StopQuizAlertTitle);
                    d2Var.Q = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    d2Var.O = LocaleController.getString(R.string.StopPollAlertTitle);
                    d2Var.Q = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new hg.a0(zu0Var, g6Var, messageObject, this.f25332e, 6));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public ar0(zu0 zu0Var, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject, int i10) {
        this.f25330b = zu0Var;
        this.f25331c = g6Var;
        this.d = messageObject;
        this.f25332e = i10;
    }
}
