package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

public final class p11 implements s9 {

    public final int f41247a;

    public final org.telegram.ui.ActionBar.n2 f41248b;

    public p11(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f41247a = i10;
        this.f41248b = n2Var;
    }

    @Override
    public final void C(String str) {
        String strB = we.e.b(str);
        if (TextUtils.isEmpty(strB)) {
            AndroidUtilities.runOnUIThread(new tq0(1));
            return;
        }
        MessagesController.getInstance(this.f41247a).getUserNameResolver().resolve(strB, new tb(this.f41248b, 4));
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
