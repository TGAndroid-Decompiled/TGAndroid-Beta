package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.de;
public final class s5 implements TextWatcher {
    public final String[] f45034a;
    public final u4 f45035b;
    public final Runnable[] f45036c;
    public final de d;

    public s5(String[] strArr, u4 u4Var, Runnable[] runnableArr, de deVar) {
        this.f45034a = strArr;
        this.f45035b = u4Var;
        this.f45036c = runnableArr;
        this.d = deVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f45034a[0] = editable.toString();
        this.f45035b.run();
        Runnable[] runnableArr = this.f45036c;
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
