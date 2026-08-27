package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

public final class nj0 implements s9 {

    public final oj0 f40872a;

    public nj0(oj0 oj0Var) {
        this.f40872a = oj0Var;
    }

    @Override
    public final void C(String str) {
        String strB = we.e.b(str);
        if (TextUtils.isEmpty(strB)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(28));
        } else {
            MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) this.f40872a).currentAccount).getUserNameResolver().resolve(strB, new j4.w0(11));
        }
    }

    @Override
    public final boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override
    public final String z0() {
        return null;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
