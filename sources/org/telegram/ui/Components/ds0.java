package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ds0 implements Runnable {
    public final int f27593a = 0;
    public final aw0 f27594b;
    public final org.telegram.ui.ActionBar.u6 f27595c;
    public final MessageObject d;
    public final int e;

    public ds0(aw0 aw0Var, org.telegram.ui.ActionBar.u6 u6Var, int i10, MessageObject messageObject) {
        this.f27594b = aw0Var;
        this.f27595c = u6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f27593a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(this.f27594b.getContext(), 3, this.f27595c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new xs(e2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new ns0(e2VarArr, i10, sendVote, 0), 500L);
                    return;
                }
                return;
            default:
                aw0 aw0Var = this.f27594b;
                Context context = aw0Var.getContext();
                org.telegram.ui.ActionBar.u6 u6Var = this.f27595c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                e2Var.R0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    e2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    e2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    e2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    e2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new ag.k0(aw0Var, u6Var, messageObject, this.e, 5));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                return;
        }
    }

    public ds0(aw0 aw0Var, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject, int i10) {
        this.f27594b = aw0Var;
        this.f27595c = u6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
