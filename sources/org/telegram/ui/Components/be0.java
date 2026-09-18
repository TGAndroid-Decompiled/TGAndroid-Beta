package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class be0 implements Utilities.Callback {
    public final int f22721a;
    public final String[] f22722b;
    public final Activity f22723c;
    public final Utilities.Callback d;

    public be0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f22721a = i10;
        this.f22722b = strArr;
        this.f22723c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f22721a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f22722b;
        switch (i10) {
            case 0:
                de0.a(strArr, this.f22723c, this.d);
                return;
            default:
                de0.b(strArr, this.f22723c, this.d);
                return;
        }
    }
}
