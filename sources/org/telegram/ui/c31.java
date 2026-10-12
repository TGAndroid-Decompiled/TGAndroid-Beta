package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class c31 implements y9 {
    public final int f34722a;
    public final org.telegram.ui.ActionBar.m2 f34723b;

    public c31(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f34722a = i10;
        this.f34723b = m2Var;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = pf.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f34722a).getUserNameResolver().resolve(b10, new v3(this.f34723b, 21));
        } else {
            AndroidUtilities.runOnUIThread(new b31(0));
        }
    }

    @Override
    public final boolean e1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void W0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
