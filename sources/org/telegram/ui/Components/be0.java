package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class be0 implements Utilities.Callback {
    public final int f24715a;
    public final String[] f24716b;
    public final Activity f24717c;
    public final Utilities.Callback d;

    public be0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f24715a = i10;
        this.f24716b = strArr;
        this.f24717c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24715a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f24716b;
        switch (i10) {
            case 0:
                de0.a(strArr, this.f24717c, this.d);
                return;
            default:
                de0.b(strArr, this.f24717c, this.d);
                return;
        }
    }
}
