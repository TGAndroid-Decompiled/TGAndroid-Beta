package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class m21 implements t9 {
    public final int f35444a;
    public final org.telegram.ui.ActionBar.m2 f35445b;

    public m21(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f35444a = i10;
        this.f35445b = m2Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f35444a).getUserNameResolver().resolve(b10, new t3(this.f35445b, 21));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(29));
        }
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
