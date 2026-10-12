package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.je1;
public final class f4 implements TextWatcher {
    public final String[] f33176a;
    public final je1 f33177b;
    public final Runnable[] f33178c;
    public final org.telegram.messenger.b6 d;

    public f4(String[] strArr, je1 je1Var, Runnable[] runnableArr, org.telegram.messenger.b6 b6Var) {
        this.f33176a = strArr;
        this.f33177b = je1Var;
        this.f33178c = runnableArr;
        this.d = b6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f33176a[0] = editable.toString();
        this.f33177b.run();
        Runnable[] runnableArr = this.f33178c;
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
