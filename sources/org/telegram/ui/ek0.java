package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class ek0 implements u9 {
    public final fk0 f33385a;

    public ek0(fk0 fk0Var) {
        this.f33385a = fk0Var;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void K(String str) {
        int i10;
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f33385a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ai.i(27));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(26));
    }

    @Override
    public final boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
