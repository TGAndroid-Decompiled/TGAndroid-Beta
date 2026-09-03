package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ge0 implements Utilities.Callback {
    public final int f27147a;
    public final String[] f27148b;
    public final Activity f27149c;
    public final Utilities.Callback d;

    public ge0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f27147a = i10;
        this.f27148b = strArr;
        this.f27149c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27147a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f27148b;
        switch (i10) {
            case 0:
                ie0.a(strArr, this.f27149c, this.d);
                return;
            default:
                ie0.b(strArr, this.f27149c, this.d);
                return;
        }
    }
}
