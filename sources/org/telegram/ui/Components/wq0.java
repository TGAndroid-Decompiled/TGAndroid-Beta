package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wq0 implements Runnable {
    public final int f29770a = 0;
    public final yu0 f29771b;
    public final org.telegram.ui.ActionBar.e6 f29772c;
    public final MessageObject d;
    public final int e;

    public wq0(yu0 yu0Var, org.telegram.ui.ActionBar.e6 e6Var, int i10, MessageObject messageObject) {
        this.f29771b = yu0Var;
        this.f29772c = e6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f29770a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f29771b.getContext(), 3, this.f29772c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ls(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new br0(b2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                yu0 yu0Var = this.f29771b;
                Context context = yu0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f29772c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.da(yu0Var, e6Var, messageObject, this.e, 4));
                hg.k0.r(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public wq0(yu0 yu0Var, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f29771b = yu0Var;
        this.f29772c = e6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
