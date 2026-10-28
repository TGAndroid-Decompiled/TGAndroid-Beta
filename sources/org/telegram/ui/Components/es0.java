package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class es0 implements Runnable {
    public final int f27919a = 0;
    public final bw0 f27920b;
    public final org.telegram.ui.ActionBar.u6 f27921c;
    public final MessageObject d;
    public final int e;

    public es0(bw0 bw0Var, org.telegram.ui.ActionBar.u6 u6Var, int i10, MessageObject messageObject) {
        this.f27920b = bw0Var;
        this.f27921c = u6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f27919a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(this.f27920b.getContext(), 3, this.f27921c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new xs(e2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new os0(e2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                bw0 bw0Var = this.f27920b;
                Context context = bw0Var.getContext();
                org.telegram.ui.ActionBar.u6 u6Var = this.f27921c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    e2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    e2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    e2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    e2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new ag.k0(bw0Var, u6Var, messageObject, this.e, 5));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public es0(bw0 bw0Var, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject, int i10) {
        this.f27920b = bw0Var;
        this.f27921c = u6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
