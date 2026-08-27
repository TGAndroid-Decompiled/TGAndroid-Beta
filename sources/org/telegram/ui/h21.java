package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

public final class h21 implements Runnable {

    public final int f38663a;

    public final rn f38664b;

    public final Activity f38665c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final MessageObject f38666e;

    public h21(rn rnVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.f38663a = i10;
        this.f38664b = rnVar;
        this.f38665c = activity;
        this.d = c6Var;
        this.f38666e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f38663a) {
            case 0:
                rn rnVar = this.f38664b;
                org.telegram.ui.Components.mc mcVarA0 = org.telegram.ui.Components.mc.a0(rnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.f38665c;
                mcVarA0.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                we.e.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                we.e.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                we.e.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.f38666e;
                rnVar.Fa(messageObject);
                rnVar.Ha(messageObject);
                break;
            case 1:
                rn rnVar2 = this.f38664b;
                org.telegram.ui.Components.mc mcVarA1 = org.telegram.ui.Components.mc.a0(rnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.f38665c;
                mcVarA1.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                we.e.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                we.e.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                we.e.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.f38666e;
                rnVar2.Fa(messageObject2);
                rnVar2.Ha(messageObject2);
                break;
            default:
                rn rnVar3 = this.f38664b;
                org.telegram.ui.Components.mc mcVarA2 = org.telegram.ui.Components.mc.a0(rnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.f38665c;
                mcVarA2.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                we.e.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                we.e.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                we.e.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.f38666e;
                rnVar3.Fa(messageObject3);
                rnVar3.Ha(messageObject3);
                break;
        }
    }
}
