package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class dk0 implements v9 {
    public final ek0 f33171a;

    public dk0(ek0 ek0Var) {
        this.f33171a = ek0Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        int i10;
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.g3) this.f33171a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ai.i(27));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(24));
    }

    @Override
    public final boolean e1(String str, n9 n9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
