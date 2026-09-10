package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class a31 implements t9 {
    public final int f30791a;
    public final org.telegram.ui.ActionBar.p2 f30792b;

    public a31(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f30791a = i10;
        this.f30792b = p2Var;
    }

    @Override
    public final void J(String str) {
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f30791a).getUserNameResolver().resolve(b10, new zb(this.f30792b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(22));
        }
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
