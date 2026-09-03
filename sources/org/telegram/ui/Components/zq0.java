package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zq0 implements Runnable {
    public final int f31456a = 0;
    public final yu0 f31457b;
    public final org.telegram.ui.ActionBar.f6 f31458c;
    public final MessageObject d;
    public final int e;

    public zq0(yu0 yu0Var, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject) {
        this.f31457b = yu0Var;
        this.f31458c = f6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f31456a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(this.f31457b.getContext(), 3, this.f31458c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new js(d2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new dr0(d2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                yu0 yu0Var = this.f31457b;
                Context context = yu0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f31458c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.M0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    d2Var.O = LocaleController.getString(R.string.StopQuizAlertTitle);
                    d2Var.Q = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    d2Var.O = LocaleController.getString(R.string.StopPollAlertTitle);
                    d2Var.Q = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new gg.a0(yu0Var, f6Var, messageObject, this.e, 6));
                kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public zq0(yu0 yu0Var, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.f31457b = yu0Var;
        this.f31458c = f6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
