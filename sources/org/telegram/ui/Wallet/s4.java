package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class s4 implements TextWatcher {
    public final String[] f34830a;
    public final z3 f34831b;
    public final Runnable[] f34832c;
    public final org.telegram.messenger.a6 d;

    public s4(String[] strArr, z3 z3Var, Runnable[] runnableArr, org.telegram.messenger.a6 a6Var) {
        this.f34830a = strArr;
        this.f34831b = z3Var;
        this.f34832c = runnableArr;
        this.d = a6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34830a[0] = editable.toString();
        this.f34831b.run();
        Runnable[] runnableArr = this.f34832c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        org.telegram.messenger.a6 a6Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(a6Var);
        AndroidUtilities.runOnUIThread(a6Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
