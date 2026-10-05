package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pr0 implements Runnable {
    public final int f29835a = 0;
    public final qv0 f29836b;
    public final org.telegram.ui.ActionBar.d6 f29837c;
    public final MessageObject d;
    public final int f29838e;

    public pr0(qv0 qv0Var, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject) {
        this.f29836b = qv0Var;
        this.f29837c = d6Var;
        this.f29838e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f29835a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f29836b.getContext(), 3, this.f29837c)};
                int i10 = this.f29838e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new os(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new tr0(b2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                qv0 qv0Var = this.f29836b;
                Context context = qv0Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f29837c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.fa(qv0Var, d6Var, messageObject, this.f29838e, 4));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public pr0(qv0 qv0Var, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f29836b = qv0Var;
        this.f29837c = d6Var;
        this.d = messageObject;
        this.f29838e = i10;
    }
}
