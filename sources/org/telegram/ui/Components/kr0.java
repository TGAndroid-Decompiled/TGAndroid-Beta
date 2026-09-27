package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kr0 implements Runnable {
    public final int f25827a = 0;
    public final lv0 f25828b;
    public final org.telegram.ui.ActionBar.e6 f25829c;
    public final MessageObject d;
    public final int e;

    public kr0(lv0 lv0Var, org.telegram.ui.ActionBar.e6 e6Var, int i10, MessageObject messageObject) {
        this.f25828b = lv0Var;
        this.f25829c = e6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25827a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(this.f25828b.getContext(), 3, this.f25829c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ns(c2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new or0(c2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                lv0 lv0Var = this.f25828b;
                Context context = lv0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f25829c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                c2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    c2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    c2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    c2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    c2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.ga(lv0Var, e6Var, messageObject, this.e, 4));
                hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public kr0(lv0 lv0Var, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f25828b = lv0Var;
        this.f25829c = e6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
