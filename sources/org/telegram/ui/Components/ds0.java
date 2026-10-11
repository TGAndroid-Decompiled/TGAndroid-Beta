package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ds0 implements Runnable {
    public final int f25667a = 0;
    public final dw0 f25668b;
    public final org.telegram.ui.ActionBar.d6 f25669c;
    public final MessageObject d;
    public final int f25670e;

    public ds0(dw0 dw0Var, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject) {
        this.f25668b = dw0Var;
        this.f25669c = d6Var;
        this.f25670e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25667a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(this.f25668b.getContext(), 3, this.f25669c)};
                int i10 = this.f25670e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ct(a2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new is0(a2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                dw0 dw0Var = this.f25668b;
                Context context = dw0Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f25669c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                a2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    a2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    a2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.da(dw0Var, d6Var, messageObject, this.f25670e, 4));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public ds0(dw0 dw0Var, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f25668b = dw0Var;
        this.f25669c = d6Var;
        this.d = messageObject;
        this.f25670e = i10;
    }
}
