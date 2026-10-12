package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class h4 implements TextWatcher {
    public final String[] f34833a;
    public final s f34834b;
    public final Runnable[] f34835c;
    public final org.telegram.messenger.b6 d;

    public h4(String[] strArr, s sVar, Runnable[] runnableArr, org.telegram.messenger.b6 b6Var) {
        this.f34833a = strArr;
        this.f34834b = sVar;
        this.f34835c = runnableArr;
        this.d = b6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34833a[0] = editable.toString();
        this.f34834b.run();
        Runnable[] runnableArr = this.f34835c;
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
