package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class p31 implements Runnable {
    public final int f39426a;
    public final co f39427b;
    public final Activity f39428c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final MessageObject f39429e;

    public p31(co coVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.f39426a = i10;
        this.f39427b = coVar;
        this.f39428c = activity;
        this.d = f6Var;
        this.f39429e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f39426a) {
            case 0:
                co coVar = this.f39427b;
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f39428c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                of.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                of.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                of.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.f39429e;
                coVar.Fa(messageObject);
                coVar.Ha(messageObject);
                return;
            case 1:
                co coVar2 = this.f39427b;
                org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(coVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f39428c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                of.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                of.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                of.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.f39429e;
                coVar2.Fa(messageObject2);
                coVar2.Ha(messageObject2);
                return;
            default:
                co coVar3 = this.f39427b;
                org.telegram.ui.Components.yc a04 = org.telegram.ui.Components.yc.a0(coVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f39428c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                of.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                of.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                of.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.f39429e;
                coVar3.Fa(messageObject3);
                coVar3.Ha(messageObject3);
                return;
        }
    }
}
