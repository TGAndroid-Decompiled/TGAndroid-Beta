package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.de;
import org.telegram.ui.b31;
public final class s5 implements TextWatcher {
    public final String[] f45000a;
    public final b31 f45001b;
    public final Runnable[] f45002c;
    public final de d;

    public s5(String[] strArr, b31 b31Var, Runnable[] runnableArr, de deVar) {
        this.f45000a = strArr;
        this.f45001b = b31Var;
        this.f45002c = runnableArr;
        this.d = deVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f45000a[0] = editable.toString();
        this.f45001b.run();
        Runnable[] runnableArr = this.f45002c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        de deVar = this.d;
        org.telegram.messenger.g0.r(deVar);
        org.telegram.messenger.g0.h3(deVar, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
