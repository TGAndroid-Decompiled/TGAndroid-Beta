package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k21 implements Runnable {
    public final int f39687a;
    public final org.telegram.ui.ActionBar.o2 f39688b;
    public final Context f39689c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final org.telegram.ui.Components.jg0 f39690e;

    public k21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.jg0 jg0Var, int i9) {
        this.f39687a = i9;
        this.f39688b = o2Var;
        this.f39689c = context;
        this.d = b6Var;
        this.f39690e = jg0Var;
    }

    @Override
    public final void run() {
        switch (this.f39687a) {
            case 0:
                org.telegram.ui.Components.oc.a0(this.f39688b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.f39689c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f39690e);
                return;
            case 1:
                org.telegram.ui.Components.oc.a0(this.f39688b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.f39689c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f39690e);
                return;
            default:
                org.telegram.ui.Components.oc.a0(this.f39688b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.f39689c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f39690e);
                return;
        }
    }
}
