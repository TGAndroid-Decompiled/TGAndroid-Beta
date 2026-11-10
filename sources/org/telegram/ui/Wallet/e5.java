package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ee;
import org.telegram.ui.sb1;
public final class e5 implements TextWatcher {
    public final String[] f42462a;
    public final sb1 f42463b;
    public final Runnable[] f42464c;
    public final ee d;

    public e5(String[] strArr, sb1 sb1Var, Runnable[] runnableArr, ee eeVar) {
        this.f42462a = strArr;
        this.f42463b = sb1Var;
        this.f42464c = runnableArr;
        this.d = eeVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f42462a[0] = editable.toString();
        this.f42463b.run();
        Runnable[] runnableArr = this.f42464c;
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
