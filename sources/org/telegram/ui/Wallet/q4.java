package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class q4 implements TextWatcher {
    public final String[] f34790a;
    public final u3 f34791b;
    public final Runnable[] f34792c;
    public final org.telegram.messenger.a6 d;

    public q4(String[] strArr, u3 u3Var, Runnable[] runnableArr, org.telegram.messenger.a6 a6Var) {
        this.f34790a = strArr;
        this.f34791b = u3Var;
        this.f34792c = runnableArr;
        this.d = a6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34790a[0] = editable.toString();
        this.f34791b.run();
        Runnable[] runnableArr = this.f34792c;
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
