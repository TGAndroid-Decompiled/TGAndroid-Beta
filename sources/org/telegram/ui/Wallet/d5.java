package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ee;
public final class d5 implements TextWatcher {
    public final String[] f42384a;
    public final n f42385b;
    public final Runnable[] f42386c;
    public final ee d;

    public d5(String[] strArr, n nVar, Runnable[] runnableArr, ee eeVar) {
        this.f42384a = strArr;
        this.f42385b = nVar;
        this.f42386c = runnableArr;
        this.d = eeVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f42384a[0] = editable.toString();
        this.f42385b.run();
        Runnable[] runnableArr = this.f42386c;
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
