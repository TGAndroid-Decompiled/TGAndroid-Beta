package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class mj0 implements r9 {
    public final nj0 f40480a;

    public mj0(nj0 nj0Var) {
        this.f40480a = nj0Var;
    }

    @Override
    public final String C0() {
        return null;
    }

    @Override
    public final void K(String str) {
        int i9;
        String b10 = ve.e.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i9 = ((org.telegram.ui.ActionBar.f3) this.f40480a).currentAccount;
            MessagesController.getInstance(i9).getUserNameResolver().resolve(b10, new ih.e(11));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(29));
    }

    @Override
    public final boolean i1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
