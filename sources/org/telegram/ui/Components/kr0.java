package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kr0 implements Runnable {
    public final int f25778a = 0;
    public final kv0 f25779b;
    public final org.telegram.ui.ActionBar.e6 f25780c;
    public final MessageObject d;
    public final int e;

    public kr0(kv0 kv0Var, org.telegram.ui.ActionBar.e6 e6Var, int i10, MessageObject messageObject) {
        this.f25779b = kv0Var;
        this.f25780c = e6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25778a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f25779b.getContext(), 3, this.f25780c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ls(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new or0(b2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                kv0 kv0Var = this.f25779b;
                Context context = kv0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f25780c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.ea(kv0Var, e6Var, messageObject, this.e, 4));
                hg.k0.o(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public kr0(kv0 kv0Var, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f25779b = kv0Var;
        this.f25780c = e6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
