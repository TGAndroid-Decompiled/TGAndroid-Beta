package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class nj0 implements x9 {
    public final oj0 f39467a;

    public nj0(oj0 oj0Var) {
        this.f39467a = oj0Var;
    }

    @Override
    public final void E(String str) {
        int i10;
        String b10 = pf.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f39467a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ci.e(18));
            return;
        }
        AndroidUtilities.runOnUIThread(new ff0(1));
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
