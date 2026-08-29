package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class jj0 implements q9 {
    public final kj0 f39571a;

    public jj0(kj0 kj0Var) {
        this.f39571a = kj0Var;
    }

    @Override
    public final String E0() {
        return null;
    }

    @Override
    public final void J(String str) {
        int i10;
        String b10 = ye.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f39571a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new l4.x0(11));
            return;
        }
        AndroidUtilities.runOnUIThread(new ef0(1));
    }

    @Override
    public final boolean d1(String str, i9 i9Var) {
        return false;
    }

    @Override
    public final void S0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
