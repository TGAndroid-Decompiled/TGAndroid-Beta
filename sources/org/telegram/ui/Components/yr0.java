package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yr0 implements Runnable {
    public final int f31675a = 0;
    public final xv0 f31676b;
    public final org.telegram.ui.ActionBar.c6 f31677c;
    public final MessageObject d;
    public final int e;

    public yr0(xv0 xv0Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject) {
        this.f31676b = xv0Var;
        this.f31677c = c6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f31675a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(this.f31676b.getContext(), 3, this.f31677c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ys(a2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new cs0(a2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                xv0 xv0Var = this.f31676b;
                Context context = xv0Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.f31677c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    a2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    a2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.ia(xv0Var, c6Var, messageObject, this.e, 4));
                org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public yr0(xv0 xv0Var, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.f31676b = xv0Var;
        this.f31677c = c6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
