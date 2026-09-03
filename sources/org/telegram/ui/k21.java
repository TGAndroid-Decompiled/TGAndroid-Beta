package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class k21 implements u9 {
    public final int f38179a;
    public final org.telegram.ui.ActionBar.p2 f38180b;

    public k21(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f38179a = i10;
        this.f38180b = p2Var;
    }

    @Override
    public final String E0() {
        return null;
    }

    @Override
    public final void J(String str) {
        String b10 = af.g.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f38179a).getUserNameResolver().resolve(b10, new vb(this.f38180b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new sj0(2));
        }
    }

    @Override
    public final boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
