package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class n21 implements t9 {
    public final int f35423a;
    public final org.telegram.ui.ActionBar.n2 f35424b;

    public n21(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35423a = i10;
        this.f35424b = n2Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f35423a).getUserNameResolver().resolve(b10, new t3(this.f35424b, 21));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(27));
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
