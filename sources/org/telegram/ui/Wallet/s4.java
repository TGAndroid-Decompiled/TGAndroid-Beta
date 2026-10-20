package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class s4 implements TextWatcher {
    public final String[] f34836a;
    public final z3 f34837b;
    public final Runnable[] f34838c;
    public final org.telegram.messenger.c6 d;

    public s4(String[] strArr, z3 z3Var, Runnable[] runnableArr, org.telegram.messenger.c6 c6Var) {
        this.f34836a = strArr;
        this.f34837b = z3Var;
        this.f34838c = runnableArr;
        this.d = c6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34836a[0] = editable.toString();
        this.f34837b.run();
        Runnable[] runnableArr = this.f34838c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        org.telegram.messenger.c6 c6Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(c6Var);
        AndroidUtilities.runOnUIThread(c6Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
