package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.wg1;
public final class g4 implements TextWatcher {
    public final String[] f32950a;
    public final wg1 f32951b;
    public final Runnable[] f32952c;
    public final org.telegram.messenger.b6 d;

    public g4(String[] strArr, wg1 wg1Var, Runnable[] runnableArr, org.telegram.messenger.b6 b6Var) {
        this.f32950a = strArr;
        this.f32951b = wg1Var;
        this.f32952c = runnableArr;
        this.d = b6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32950a[0] = editable.toString();
        this.f32951b.run();
        Runnable[] runnableArr = this.f32952c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        org.telegram.messenger.b6 b6Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(b6Var);
        AndroidUtilities.runOnUIThread(b6Var, 1000L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
