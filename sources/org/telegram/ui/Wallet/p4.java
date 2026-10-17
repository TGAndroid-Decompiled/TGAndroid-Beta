package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class p4 implements TextWatcher {
    public final String[] f34705a;
    public final t3 f34706b;
    public final Runnable[] f34707c;
    public final org.telegram.messenger.a6 d;

    public p4(String[] strArr, t3 t3Var, Runnable[] runnableArr, org.telegram.messenger.a6 a6Var) {
        this.f34705a = strArr;
        this.f34706b = t3Var;
        this.f34707c = runnableArr;
        this.d = a6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34705a[0] = editable.toString();
        this.f34706b.run();
        Runnable[] runnableArr = this.f34707c;
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
