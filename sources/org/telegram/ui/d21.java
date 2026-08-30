package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class d21 implements u9 {
    public final int f33491a;
    public final org.telegram.ui.ActionBar.p2 f33492b;

    public d21(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f33491a = i10;
        this.f33492b = p2Var;
    }

    @Override
    public final String G0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = af.g.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f33491a).getUserNameResolver().resolve(b10, new vb(this.f33492b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new c21(0));
        }
    }

    @Override
    public final boolean f1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public final void S0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
