package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hs0 implements Runnable {
    public final int f26901a = 0;
    public final hw0 f26902b;
    public final org.telegram.ui.ActionBar.c6 f26903c;
    public final MessageObject d;
    public final int f26904e;

    public hs0(hw0 hw0Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject) {
        this.f26902b = hw0Var;
        this.f26903c = c6Var;
        this.f26904e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f26901a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(this.f26902b.getContext(), 3, this.f26903c)};
                int i10 = this.f26904e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new dt(a2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new ms0(a2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                hw0 hw0Var = this.f26902b;
                Context context = hw0Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.f26903c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                a2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    a2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    a2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.ha(hw0Var, c6Var, messageObject, this.f26904e, 4));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public hs0(hw0 hw0Var, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.f26902b = hw0Var;
        this.f26903c = c6Var;
        this.d = messageObject;
        this.f26904e = i10;
    }
}
