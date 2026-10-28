package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class pj0 implements x9 {
    public final qj0 f42450a;

    public pj0(qj0 qj0Var) {
        this.f42450a = qj0Var;
    }

    @Override
    public final void H(String str) {
        int i10;
        String b10 = qf.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.k3) this.f42450a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new di.e(18));
            return;
        }
        AndroidUtilities.runOnUIThread(new w90(4));
    }

    @Override
    public final String H0() {
        return null;
    }

    @Override
    public final boolean d1(String str, p9 p9Var) {
        return false;
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void R0(MrzRecognizer.Result result) {
    }
}
