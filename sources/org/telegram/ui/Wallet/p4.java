package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yc1;
public final class p4 implements TextWatcher {
    public final String[] f37119a;
    public final yc1 f37120b;
    public final Runnable[] f37121c;
    public final org.telegram.messenger.e6 d;

    public p4(String[] strArr, yc1 yc1Var, Runnable[] runnableArr, org.telegram.messenger.e6 e6Var) {
        this.f37119a = strArr;
        this.f37120b = yc1Var;
        this.f37121c = runnableArr;
        this.d = e6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f37119a[0] = editable.toString();
        this.f37120b.run();
        Runnable[] runnableArr = this.f37121c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        org.telegram.messenger.e6 e6Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(e6Var);
        AndroidUtilities.runOnUIThread(e6Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
