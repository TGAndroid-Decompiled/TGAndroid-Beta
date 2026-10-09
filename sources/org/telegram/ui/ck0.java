package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class ck0 implements u9 {
    public final dk0 f36698a;

    public ck0(dk0 dk0Var) {
        this.f36698a = dk0Var;
    }

    @Override
    public final void K(String str) {
        int i10;
        String b10 = of.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.f3) this.f36698a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ai.i(18));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(26));
    }

    @Override
    public final boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public final String z0() {
        return null;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
