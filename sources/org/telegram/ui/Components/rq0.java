package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rq0 implements Runnable {
    public final int f32366a = 0;
    public final qu0 f32367b;
    public final org.telegram.ui.ActionBar.c6 f32368c;
    public final MessageObject d;
    public final int f32369e;

    public rq0(qu0 qu0Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject) {
        this.f32367b = qu0Var;
        this.f32368c = c6Var;
        this.f32369e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32366a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(this.f32367b.getContext(), 3, this.f32368c)};
                int i10 = this.f32369e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new gs(c2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new vq0(c2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                qu0 qu0Var = this.f32367b;
                Context context = qu0Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.f32368c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.L0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    c2Var.N = LocaleController.getString(R.string.StopQuizAlertTitle);
                    c2Var.P = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    c2Var.N = LocaleController.getString(R.string.StopPollAlertTitle);
                    c2Var.P = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new eg.b0(qu0Var, c6Var, messageObject, this.f32369e, 6));
                j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public rq0(qu0 qu0Var, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.f32367b = qu0Var;
        this.f32368c = c6Var;
        this.d = messageObject;
        this.f32369e = i10;
    }
}
