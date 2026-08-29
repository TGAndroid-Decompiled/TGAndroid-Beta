package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class wd0 implements Utilities.Callback {
    public final int f34388a;
    public final String[] f34389b;
    public final Activity f34390c;
    public final Utilities.Callback d;

    public wd0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f34388a = i10;
        this.f34389b = strArr;
        this.f34390c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f34388a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f34389b;
        switch (i10) {
            case 0:
                yd0.a(strArr, this.f34390c, this.d);
                return;
            default:
                yd0.b(strArr, this.f34390c, this.d);
                return;
        }
    }
}
