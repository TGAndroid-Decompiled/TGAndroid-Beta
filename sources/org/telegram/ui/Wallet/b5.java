package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ee;
import org.telegram.ui.wb1;
public final class b5 implements TextWatcher {
    public final String[] f42269a;
    public final wb1 f42270b;
    public final Runnable[] f42271c;
    public final ee d;

    public b5(String[] strArr, wb1 wb1Var, Runnable[] runnableArr, ee eeVar) {
        this.f42269a = strArr;
        this.f42270b = wb1Var;
        this.f42271c = runnableArr;
        this.d = eeVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f42269a[0] = editable.toString();
        this.f42270b.run();
        Runnable[] runnableArr = this.f42271c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        ee eeVar = this.d;
        org.telegram.messenger.g0.r(eeVar);
        org.telegram.messenger.g0.i3(eeVar, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
