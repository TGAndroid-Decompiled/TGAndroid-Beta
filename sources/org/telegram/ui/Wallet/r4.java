package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class r4 implements TextWatcher {
    public final String[] f34776a;
    public final v3 f34777b;
    public final Runnable[] f34778c;
    public final org.telegram.messenger.b6 d;

    public r4(String[] strArr, v3 v3Var, Runnable[] runnableArr, org.telegram.messenger.b6 b6Var) {
        this.f34776a = strArr;
        this.f34777b = v3Var;
        this.f34778c = runnableArr;
        this.d = b6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34776a[0] = editable.toString();
        this.f34777b.run();
        Runnable[] runnableArr = this.f34778c;
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
