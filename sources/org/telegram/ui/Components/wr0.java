package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wr0 implements Runnable {
    public final int f32339a = 0;
    public final wv0 f32340b;
    public final org.telegram.ui.ActionBar.g6 f32341c;
    public final MessageObject d;
    public final int e;

    public wr0(wv0 wv0Var, org.telegram.ui.ActionBar.g6 g6Var, int i10, MessageObject messageObject) {
        this.f32340b = wv0Var;
        this.f32341c = g6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32339a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(this.f32340b.getContext(), 3, this.f32341c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ts(c2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new bs0(c2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                wv0 wv0Var = this.f32340b;
                Context context = wv0Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var = this.f32341c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    c2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    c2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    c2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    c2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.fa(wv0Var, g6Var, messageObject, this.e, 4));
                i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public wr0(wv0 wv0Var, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject, int i10) {
        this.f32340b = wv0Var;
        this.f32341c = g6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
