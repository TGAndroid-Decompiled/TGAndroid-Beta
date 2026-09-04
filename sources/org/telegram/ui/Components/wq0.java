package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wq0 implements Runnable {
    public final int f32318a = 0;
    public final xu0 f32319b;
    public final org.telegram.ui.ActionBar.f6 f32320c;
    public final MessageObject d;
    public final int f32321e;

    public wq0(xu0 xu0Var, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject) {
        this.f32319b = xu0Var;
        this.f32320c = f6Var;
        this.f32321e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32318a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f32319b.getContext(), 3, this.f32320c)};
                int i10 = this.f32321e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ks(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new ar0(b2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                xu0 xu0Var = this.f32319b;
                Context context = xu0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f32320c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.da(xu0Var, f6Var, messageObject, this.f32321e, 4));
                i2.g.r(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public wq0(xu0 xu0Var, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.f32319b = xu0Var;
        this.f32320c = f6Var;
        this.d = messageObject;
        this.f32321e = i10;
    }
}
