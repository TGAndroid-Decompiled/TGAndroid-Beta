package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class f31 implements Runnable {
    public final int f33537a;
    public final wn f33538b;
    public final Activity f33539c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final MessageObject e;

    public f31(wn wnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f33537a = i10;
        this.f33538b = wnVar;
        this.f33539c = activity;
        this.d = d6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f33537a) {
            case 0:
                wn wnVar = this.f33538b;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(wnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f33539c;
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
                wnVar.Fa(messageObject);
                wnVar.Ha(messageObject);
                return;
            case 1:
                wn wnVar2 = this.f33538b;
                org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(wnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f33539c;
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
                wnVar2.Fa(messageObject2);
                wnVar2.Ha(messageObject2);
                return;
            default:
                wn wnVar3 = this.f33538b;
                org.telegram.ui.Components.xc a04 = org.telegram.ui.Components.xc.a0(wnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f33539c;
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
                wnVar3.Fa(messageObject3);
                wnVar3.Ha(messageObject3);
                return;
        }
    }
}
