package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class lj0 implements v9 {
    public final mj0 f38943a;

    public lj0(mj0 mj0Var) {
        this.f38943a = mj0Var;
    }

    @Override
    public final void E(String str) {
        int i10;
        String b10 = pf.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f38943a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ci.e(18));
            return;
        }
        AndroidUtilities.runOnUIThread(new df0(1));
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
