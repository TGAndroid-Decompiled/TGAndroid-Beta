package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.de;
public final class d5 implements TextWatcher {
    public final String[] f43747a;
    public final r f43748b;
    public final Runnable[] f43749c;
    public final de d;

    public d5(String[] strArr, r rVar, Runnable[] runnableArr, de deVar) {
        this.f43747a = strArr;
        this.f43748b = rVar;
        this.f43749c = runnableArr;
        this.d = deVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f43747a[0] = editable.toString();
        this.f43748b.run();
        Runnable[] runnableArr = this.f43749c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        de deVar = this.d;
        org.telegram.messenger.g0.r(deVar);
        org.telegram.messenger.g0.i3(deVar, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
