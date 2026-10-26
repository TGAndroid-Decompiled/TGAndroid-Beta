package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.zc1;
public final class p4 implements TextWatcher {
    public final String[] f37096a;
    public final zc1 f37097b;
    public final Runnable[] f37098c;
    public final org.telegram.messenger.d6 d;

    public p4(String[] strArr, zc1 zc1Var, Runnable[] runnableArr, org.telegram.messenger.d6 d6Var) {
        this.f37096a = strArr;
        this.f37097b = zc1Var;
        this.f37098c = runnableArr;
        this.d = d6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f37096a[0] = editable.toString();
        this.f37097b.run();
        Runnable[] runnableArr = this.f37098c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        org.telegram.messenger.d6 d6Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(d6Var);
        AndroidUtilities.runOnUIThread(d6Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
