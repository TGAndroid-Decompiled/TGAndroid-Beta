package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e31 implements Runnable {
    public final int f33600a;
    public final org.telegram.ui.ActionBar.p2 f33601b;
    public final Context f33602c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.z80 e;

    public e31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.z80 z80Var, int i10) {
        this.f33600a = i10;
        this.f33601b = p2Var;
        this.f33602c = context;
        this.d = f6Var;
        this.e = z80Var;
    }

    @Override
    public final void run() {
        switch (this.f33600a) {
            case 0:
                org.telegram.ui.Components.qc.a0(this.f33601b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f33602c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.qc.a0(this.f33601b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f33602c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.qc.a0(this.f33601b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f33602c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
