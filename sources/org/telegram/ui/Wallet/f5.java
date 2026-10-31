package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ce;
public final class f5 implements TextWatcher {
    public final String[] f34500a;
    public final k3 f34501b;
    public final Runnable[] f34502c;
    public final ce d;

    public f5(String[] strArr, k3 k3Var, Runnable[] runnableArr, ce ceVar) {
        this.f34500a = strArr;
        this.f34501b = k3Var;
        this.f34502c = runnableArr;
        this.d = ceVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34500a[0] = editable.toString();
        this.f34501b.run();
        Runnable[] runnableArr = this.f34502c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        ce ceVar = this.d;
        org.telegram.messenger.i0.r(ceVar);
        org.telegram.messenger.i0.h3(ceVar, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
