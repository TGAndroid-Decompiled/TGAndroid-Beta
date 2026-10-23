package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class s4 implements TextWatcher {
    public final String[] f34841a;
    public final z3 f34842b;
    public final Runnable[] f34843c;
    public final org.telegram.messenger.b6 d;

    public s4(String[] strArr, z3 z3Var, Runnable[] runnableArr, org.telegram.messenger.b6 b6Var) {
        this.f34841a = strArr;
        this.f34842b = z3Var;
        this.f34843c = runnableArr;
        this.d = b6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34841a[0] = editable.toString();
        this.f34842b.run();
        Runnable[] runnableArr = this.f34843c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        org.telegram.messenger.b6 b6Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(b6Var);
        AndroidUtilities.runOnUIThread(b6Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
