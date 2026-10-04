package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class o21 implements v9 {
    public final int f39093a;
    public final org.telegram.ui.ActionBar.n2 f39094b;

    public o21(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39093a = i10;
        this.f39094b = n2Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void L(String str) {
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f39093a).getUserNameResolver().resolve(b10, new t3(this.f39094b, 21));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(29));
        }
    }

    @Override
    public final boolean g1(String str, n9 n9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
