package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class k21 implements w9 {
    public final int f35409a;
    public final org.telegram.ui.ActionBar.p2 f35410b;

    public k21(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f35409a = i10;
        this.f35410b = p2Var;
    }

    @Override
    public final String C0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = ze.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f35409a).getUserNameResolver().resolve(b10, new xb(this.f35410b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new j21(0));
        }
    }

    @Override
    public final boolean a1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
