package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.de;
public final class f5 implements TextWatcher {
    public final String[] f34498a;
    public final m2 f34499b;
    public final Runnable[] f34500c;
    public final de d;

    public f5(String[] strArr, m2 m2Var, Runnable[] runnableArr, de deVar) {
        this.f34498a = strArr;
        this.f34499b = m2Var;
        this.f34500c = runnableArr;
        this.d = deVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34498a[0] = editable.toString();
        this.f34499b.run();
        Runnable[] runnableArr = this.f34500c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        de deVar = this.d;
        org.telegram.messenger.i0.r(deVar);
        org.telegram.messenger.i0.h3(deVar, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
