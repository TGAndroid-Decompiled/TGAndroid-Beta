package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.yd;
import org.telegram.ui.ma1;
public final class b5 implements TextWatcher {
    public final String[] f42279a;
    public final ma1 f42280b;
    public final Runnable[] f42281c;
    public final yd d;

    public b5(String[] strArr, ma1 ma1Var, Runnable[] runnableArr, yd ydVar) {
        this.f42279a = strArr;
        this.f42280b = ma1Var;
        this.f42281c = runnableArr;
        this.d = ydVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f42279a[0] = editable.toString();
        this.f42280b.run();
        Runnable[] runnableArr = this.f42281c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        yd ydVar = this.d;
        org.telegram.messenger.g0.r(ydVar);
        org.telegram.messenger.g0.i3(ydVar, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
