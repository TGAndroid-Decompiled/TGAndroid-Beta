package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ce;
public final class t5 implements TextWatcher {
    public final String[] f45162a;
    public final r f45163b;
    public final Runnable[] f45164c;
    public final ce d;

    public t5(String[] strArr, r rVar, Runnable[] runnableArr, ce ceVar) {
        this.f45162a = strArr;
        this.f45163b = rVar;
        this.f45164c = runnableArr;
        this.d = ceVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f45162a[0] = editable.toString();
        this.f45163b.run();
        Runnable[] runnableArr = this.f45164c;
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
