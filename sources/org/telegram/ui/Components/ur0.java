package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ur0 implements Runnable {
    public final int f31008a = 0;
    public final uv0 f31009b;
    public final org.telegram.ui.ActionBar.d6 f31010c;
    public final MessageObject d;
    public final int e;

    public ur0(uv0 uv0Var, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject) {
        this.f31009b = uv0Var;
        this.f31010c = d6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f31008a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f31009b.getContext(), 3, this.f31010c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new vs(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new zr0(b2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                uv0 uv0Var = this.f31009b;
                Context context = uv0Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f31010c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.fa(uv0Var, d6Var, messageObject, this.e, 4));
                i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public ur0(uv0 uv0Var, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f31009b = uv0Var;
        this.f31010c = d6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
