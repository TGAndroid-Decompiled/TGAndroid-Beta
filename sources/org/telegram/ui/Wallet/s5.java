package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ce;
import org.telegram.ui.b31;
public final class s5 implements TextWatcher {
    public final String[] f44990a;
    public final b31 f44991b;
    public final Runnable[] f44992c;
    public final ce d;

    public s5(String[] strArr, b31 b31Var, Runnable[] runnableArr, ce ceVar) {
        this.f44990a = strArr;
        this.f44991b = b31Var;
        this.f44992c = runnableArr;
        this.d = ceVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f44990a[0] = editable.toString();
        this.f44991b.run();
        Runnable[] runnableArr = this.f44992c;
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
