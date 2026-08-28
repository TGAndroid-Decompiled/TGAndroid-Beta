package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class id0 implements Utilities.Callback {
    public final int f29418a;
    public final String[] f29419b;
    public final Activity f29420c;
    public final Utilities.Callback d;

    public id0(String[] strArr, Activity activity, Utilities.Callback callback, int i9) {
        this.f29418a = i9;
        this.f29419b = strArr;
        this.f29420c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i9 = this.f29418a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f29419b;
        switch (i9) {
            case 0:
                kd0.a(strArr, this.f29420c, this.d);
                return;
            default:
                kd0.b(strArr, this.f29420c, this.d);
                return;
        }
    }
}
