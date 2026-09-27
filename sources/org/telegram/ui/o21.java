package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class o21 implements w9 {
    public final int f36125a;
    public final org.telegram.ui.ActionBar.o2 f36126b;

    public o21(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36125a = i10;
        this.f36126b = o2Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f36125a).getUserNameResolver().resolve(b10, new u3(this.f36126b, 21));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(29));
        }
    }

    @Override
    public final boolean e1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
