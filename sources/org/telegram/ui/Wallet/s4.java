package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class s4 implements TextWatcher {
    public final String[] f34840a;
    public final z3 f34841b;
    public final Runnable[] f34842c;
    public final org.telegram.messenger.c6 d;

    public s4(String[] strArr, z3 z3Var, Runnable[] runnableArr, org.telegram.messenger.c6 c6Var) {
        this.f34840a = strArr;
        this.f34841b = z3Var;
        this.f34842c = runnableArr;
        this.d = c6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34840a[0] = editable.toString();
        this.f34841b.run();
        Runnable[] runnableArr = this.f34842c;
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
