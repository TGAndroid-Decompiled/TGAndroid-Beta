package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class gk0 implements y9 {
    public final hk0 f36272a;

    public gk0(hk0 hk0Var) {
        this.f36272a = hk0Var;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void K(String str) {
        int i10;
        String b10 = pf.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.e3) this.f36272a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new bi.f(18));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(27));
    }

    @Override
    public final boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void V0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
