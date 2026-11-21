package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ce;
public final class s5 implements TextWatcher {
    public final String[] f45030a;
    public final u4 f45031b;
    public final Runnable[] f45032c;
    public final ce d;

    public s5(String[] strArr, u4 u4Var, Runnable[] runnableArr, ce ceVar) {
        this.f45030a = strArr;
        this.f45031b = u4Var;
        this.f45032c = runnableArr;
        this.d = ceVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f45030a[0] = editable.toString();
        this.f45031b.run();
        Runnable[] runnableArr = this.f45032c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        ce ceVar = this.d;
        org.telegram.messenger.g0.r(ceVar);
        org.telegram.messenger.g0.h3(ceVar, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
