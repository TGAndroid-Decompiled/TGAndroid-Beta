package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class h4 implements TextWatcher {
    public final String[] f35022a;
    public final i f35023b;
    public final Runnable[] f35024c;
    public final org.telegram.messenger.z5 d;

    public h4(String[] strArr, i iVar, Runnable[] runnableArr, org.telegram.messenger.z5 z5Var) {
        this.f35022a = strArr;
        this.f35023b = iVar;
        this.f35024c = runnableArr;
        this.d = z5Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f35022a[0] = editable.toString();
        this.f35023b.run();
        Runnable[] runnableArr = this.f35024c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        org.telegram.messenger.z5 z5Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        AndroidUtilities.runOnUIThread(z5Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
