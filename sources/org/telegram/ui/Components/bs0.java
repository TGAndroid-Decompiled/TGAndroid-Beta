package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bs0 implements Runnable {
    public final int f25095a = 0;
    public final bw0 f25096b;
    public final org.telegram.ui.ActionBar.e6 f25097c;
    public final MessageObject d;
    public final int f25098e;

    public bs0(bw0 bw0Var, org.telegram.ui.ActionBar.e6 e6Var, int i10, MessageObject messageObject) {
        this.f25096b = bw0Var;
        this.f25097c = e6Var;
        this.f25098e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25095a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f25096b.getContext(), 3, this.f25097c)};
                int i10 = this.f25098e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new bt(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new gs0(b2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                bw0 bw0Var = this.f25096b;
                Context context = bw0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f25097c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.ea(bw0Var, e6Var, messageObject, this.f25098e, 4));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public bs0(bw0 bw0Var, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f25096b = bw0Var;
        this.f25097c = e6Var;
        this.d = messageObject;
        this.f25098e = i10;
    }
}
