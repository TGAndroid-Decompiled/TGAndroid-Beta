package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class h31 implements Runnable {
    public final int f34120a;
    public final xn f34121b;
    public final Activity f34122c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final MessageObject e;

    public h31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f34120a = i10;
        this.f34121b = xnVar;
        this.f34122c = activity;
        this.d = e6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f34120a) {
            case 0:
                xn xnVar = this.f34121b;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(xnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f34122c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                return;
            case 1:
                xn xnVar2 = this.f34121b;
                org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(xnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f34122c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                xnVar2.Fa(messageObject2);
                xnVar2.Ha(messageObject2);
                return;
            default:
                xn xnVar3 = this.f34121b;
                org.telegram.ui.Components.xc a04 = org.telegram.ui.Components.xc.a0(xnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f34122c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                xnVar3.Fa(messageObject3);
                xnVar3.Ha(messageObject3);
                return;
        }
    }
}
