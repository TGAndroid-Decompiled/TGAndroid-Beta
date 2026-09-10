package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class dk0 implements t9 {
    public final ek0 f31934a;

    public dk0(ek0 ek0Var) {
        this.f31934a = ek0Var;
    }

    @Override
    public final void J(String str) {
        int i10;
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.h3) this.f31934a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new gg.g0(24));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(19));
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
