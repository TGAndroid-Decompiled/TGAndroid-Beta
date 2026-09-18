package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class n31 implements Runnable {
    public final int f35812a;
    public final zn f35813b;
    public final Activity f35814c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final MessageObject e;

    public n31(zn znVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f35812a = i10;
        this.f35813b = znVar;
        this.f35814c = activity;
        this.d = e6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f35812a) {
            case 0:
                zn znVar = this.f35813b;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(znVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f35814c;
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
                znVar.Fa(messageObject);
                znVar.Ha(messageObject);
                return;
            case 1:
                zn znVar2 = this.f35813b;
                org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(znVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f35814c;
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
                znVar2.Fa(messageObject2);
                znVar2.Ha(messageObject2);
                return;
            default:
                zn znVar3 = this.f35813b;
                org.telegram.ui.Components.xc a04 = org.telegram.ui.Components.xc.a0(znVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f35814c;
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
                znVar3.Fa(messageObject3);
                znVar3.Ha(messageObject3);
                return;
        }
    }
}
