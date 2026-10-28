package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class j21 implements Runnable {
    public final int f40363a;
    public final wn f40364b;
    public final Activity f40365c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final MessageObject e;

    public j21(wn wnVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject, int i10) {
        this.f40363a = i10;
        this.f40364b = wnVar;
        this.f40365c = activity;
        this.d = u6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f40363a) {
            case 0:
                wn wnVar = this.f40364b;
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f40365c;
                b02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                qf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                qf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                qf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                wnVar.Ra(messageObject);
                wnVar.Ta(messageObject);
                return;
            case 1:
                wn wnVar2 = this.f40364b;
                org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(wnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f40365c;
                b03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                qf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                qf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                qf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                wnVar2.Ra(messageObject2);
                wnVar2.Ta(messageObject2);
                return;
            default:
                wn wnVar3 = this.f40364b;
                org.telegram.ui.Components.wc b04 = org.telegram.ui.Components.wc.b0(wnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f40365c;
                b04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                qf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                qf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                qf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                wnVar3.Ra(messageObject3);
                wnVar3.Ta(messageObject3);
                return;
        }
    }
}
