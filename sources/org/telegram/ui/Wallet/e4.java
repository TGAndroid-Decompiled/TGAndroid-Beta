package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ii1;
public final class e4 implements TextWatcher {
    public final String[] f34835a;
    public final ii1 f34836b;
    public final Runnable[] f34837c;
    public final org.telegram.messenger.z5 d;

    public e4(String[] strArr, ii1 ii1Var, Runnable[] runnableArr, org.telegram.messenger.z5 z5Var) {
        this.f34835a = strArr;
        this.f34836b = ii1Var;
        this.f34837c = runnableArr;
        this.d = z5Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34835a[0] = editable.toString();
        this.f34836b.run();
        Runnable[] runnableArr = this.f34837c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        org.telegram.messenger.z5 z5Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        AndroidUtilities.runOnUIThread(z5Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
