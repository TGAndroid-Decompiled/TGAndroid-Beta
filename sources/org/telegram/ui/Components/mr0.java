package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mr0 implements Runnable {
    public final int f26361a = 0;
    public final mv0 f26362b;
    public final org.telegram.ui.ActionBar.d6 f26363c;
    public final MessageObject d;
    public final int e;

    public mr0(mv0 mv0Var, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject) {
        this.f26362b = mv0Var;
        this.f26363c = d6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f26361a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(this.f26362b.getContext(), 3, this.f26363c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new os(a2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new qr0(a2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                mv0 mv0Var = this.f26362b;
                Context context = mv0Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f26363c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                a2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    a2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    a2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.da(mv0Var, d6Var, messageObject, this.e, 4));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public mr0(mv0 mv0Var, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f26362b = mv0Var;
        this.f26363c = d6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
