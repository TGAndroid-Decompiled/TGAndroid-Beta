package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lr0 implements Runnable {
    public final int f26165a = 0;
    public final lv0 f26166b;
    public final org.telegram.ui.ActionBar.f6 f26167c;
    public final MessageObject d;
    public final int e;

    public lr0(lv0 lv0Var, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject) {
        this.f26166b = lv0Var;
        this.f26167c = f6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f26165a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.f26166b.getContext(), 3, this.f26167c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ls(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new pr0(b2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                lv0 lv0Var = this.f26166b;
                Context context = lv0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f26167c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.ea(lv0Var, f6Var, messageObject, this.e, 4));
                hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public lr0(lv0 lv0Var, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.f26166b = lv0Var;
        this.f26167c = f6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
