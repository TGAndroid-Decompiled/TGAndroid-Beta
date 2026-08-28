package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class q11 implements r9 {
    public final int f41648a;
    public final org.telegram.ui.ActionBar.o2 f41649b;

    public q11(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f41648a = i9;
        this.f41649b = o2Var;
    }

    @Override
    public final String C0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = ve.e.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f41648a).getUserNameResolver().resolve(b10, new sb(this.f41649b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new lj0(2));
        }
    }

    @Override
    public final boolean i1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
