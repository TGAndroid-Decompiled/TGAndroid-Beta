package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hr0 implements Runnable {
    public final int f23751a = 0;
    public final iv0 f23752b;
    public final org.telegram.ui.ActionBar.f6 f23753c;
    public final MessageObject d;
    public final int e;

    public hr0(iv0 iv0Var, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject) {
        this.f23752b = iv0Var;
        this.f23753c = f6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23751a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(this.f23752b.getContext(), 3, this.f23753c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new rs(d2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new lr0(d2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                iv0 iv0Var = this.f23752b;
                Context context = iv0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f23753c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    d2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    d2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    d2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    d2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.ea(iv0Var, f6Var, messageObject, this.e, 4));
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public hr0(iv0 iv0Var, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.f23752b = iv0Var;
        this.f23753c = f6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
