package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class be0 implements Utilities.Callback {
    public final int f22718a;
    public final String[] f22719b;
    public final Activity f22720c;
    public final Utilities.Callback d;

    public be0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f22718a = i10;
        this.f22719b = strArr;
        this.f22720c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f22718a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f22719b;
        switch (i10) {
            case 0:
                de0.a(strArr, this.f22720c, this.d);
                return;
            default:
                de0.b(strArr, this.f22720c, this.d);
                return;
        }
    }
}
