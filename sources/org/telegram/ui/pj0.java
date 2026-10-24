package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class pj0 implements v9 {
    public final qj0 f40583a;

    public pj0(qj0 qj0Var) {
        this.f40583a = qj0Var;
    }

    @Override
    public final void E(String str) {
        int i10;
        String b10 = pf.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.h3) this.f40583a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ci.e(18));
            return;
        }
        AndroidUtilities.runOnUIThread(new hf0(1));
    }

    @Override
    public final boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public final String p0() {
        return null;
    }

    @Override
    public final void F0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
