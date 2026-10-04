package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ne0 implements Utilities.Callback {
    public final int f28959a;
    public final String[] f28960b;
    public final Activity f28961c;
    public final Utilities.Callback d;

    public ne0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f28959a = i10;
        this.f28960b = strArr;
        this.f28961c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f28959a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f28960b;
        switch (i10) {
            case 0:
                pe0.a(strArr, this.f28961c, this.d);
                return;
            default:
                pe0.b(strArr, this.f28961c, this.d);
                return;
        }
    }
}
