package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zq0 implements Runnable {
    public final int f34002a = 0;
    public final yu0 f34003b;
    public final org.telegram.ui.ActionBar.g6 f34004c;
    public final MessageObject d;
    public final int f34005e;

    public zq0(yu0 yu0Var, org.telegram.ui.ActionBar.g6 g6Var, int i10, MessageObject messageObject) {
        this.f34003b = yu0Var;
        this.f34004c = g6Var;
        this.f34005e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f34002a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(this.f34003b.getContext(), 3, this.f34004c)};
                int i10 = this.f34005e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ms(d2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new dr0(d2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                yu0 yu0Var = this.f34003b;
                Context context = yu0Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var = this.f34004c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.M0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    d2Var.O = LocaleController.getString(R.string.StopQuizAlertTitle);
                    d2Var.Q = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    d2Var.O = LocaleController.getString(R.string.StopPollAlertTitle);
                    d2Var.Q = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new hg.a0(yu0Var, g6Var, messageObject, this.f34005e, 6));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public zq0(yu0 yu0Var, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject, int i10) {
        this.f34003b = yu0Var;
        this.f34004c = g6Var;
        this.d = messageObject;
        this.f34005e = i10;
    }
}
