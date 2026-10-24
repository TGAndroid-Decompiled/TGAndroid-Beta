package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class r4 implements TextWatcher {
    public final String[] f35103a;
    public final y3 f35104b;
    public final Runnable[] f35105c;
    public final org.telegram.messenger.c6 d;

    public r4(String[] strArr, y3 y3Var, Runnable[] runnableArr, org.telegram.messenger.c6 c6Var) {
        this.f35103a = strArr;
        this.f35104b = y3Var;
        this.f35105c = runnableArr;
        this.d = c6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f35103a[0] = editable.toString();
        this.f35104b.run();
        Runnable[] runnableArr = this.f35105c;
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
