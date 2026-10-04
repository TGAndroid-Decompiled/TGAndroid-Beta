package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ne0 implements Utilities.Callback {
    public final int f28954a;
    public final String[] f28955b;
    public final Activity f28956c;
    public final Utilities.Callback d;

    public ne0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f28954a = i10;
        this.f28955b = strArr;
        this.f28956c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f28954a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f28955b;
        switch (i10) {
            case 0:
                pe0.a(strArr, this.f28956c, this.d);
                return;
            default:
                pe0.b(strArr, this.f28956c, this.d);
                return;
        }
    }
}
