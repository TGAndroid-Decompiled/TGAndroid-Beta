package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class a21 implements Runnable {
    public final int f35257a;
    public final qn f35258b;
    public final Activity f35259c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final MessageObject e;

    public a21(qn qnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f35257a = i10;
        this.f35258b = qnVar;
        this.f35259c = activity;
        this.d = d6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f35257a) {
            case 0:
                qn qnVar = this.f35258b;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f35259c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                qnVar.Ja(messageObject);
                qnVar.La(messageObject);
                return;
            case 1:
                qn qnVar2 = this.f35258b;
                org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(qnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f35259c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                qnVar2.Ja(messageObject2);
                qnVar2.La(messageObject2);
                return;
            default:
                qn qnVar3 = this.f35258b;
                org.telegram.ui.Components.xc a04 = org.telegram.ui.Components.xc.a0(qnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f35259c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                qnVar3.Ja(messageObject3);
                qnVar3.La(messageObject3);
                return;
        }
    }
}
