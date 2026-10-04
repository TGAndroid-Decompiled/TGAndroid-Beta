package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ne0 implements Utilities.Callback {
    public final int f28953a;
    public final String[] f28954b;
    public final Activity f28955c;
    public final Utilities.Callback d;

    public ne0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f28953a = i10;
        this.f28954b = strArr;
        this.f28955c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f28953a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f28954b;
        switch (i10) {
            case 0:
                pe0.a(strArr, this.f28955c, this.d);
                return;
            default:
                pe0.b(strArr, this.f28955c, this.d);
                return;
        }
    }
}
