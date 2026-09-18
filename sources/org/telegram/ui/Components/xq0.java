package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xq0 implements Runnable {
    public final int f29976a = 0;
    public final zu0 f29977b;
    public final org.telegram.ui.ActionBar.f6 f29978c;
    public final MessageObject d;
    public final int e;

    public xq0(zu0 zu0Var, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject) {
        this.f29977b = zu0Var;
        this.f29978c = f6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f29976a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(this.f29977b.getContext(), 3, this.f29978c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ls(c2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new cr0(c2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                zu0 zu0Var = this.f29977b;
                Context context = zu0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f29978c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    c2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    c2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    c2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    c2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.fa(zu0Var, f6Var, messageObject, this.e, 4));
                hg.k0.r(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public xq0(zu0 zu0Var, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.f29977b = zu0Var;
        this.f29978c = f6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
