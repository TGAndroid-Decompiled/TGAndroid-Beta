package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class r4 implements TextWatcher {
    public final String[] f35101a;
    public final y3 f35102b;
    public final Runnable[] f35103c;
    public final org.telegram.messenger.b6 d;

    public r4(String[] strArr, y3 y3Var, Runnable[] runnableArr, org.telegram.messenger.b6 b6Var) {
        this.f35101a = strArr;
        this.f35102b = y3Var;
        this.f35103c = runnableArr;
        this.d = b6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f35101a[0] = editable.toString();
        this.f35102b.run();
        Runnable[] runnableArr = this.f35103c;
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
