package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class fe0 implements Utilities.Callback {
    public final int f24866a;
    public final String[] f24867b;
    public final Activity f24868c;
    public final Utilities.Callback d;

    public fe0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f24866a = i10;
        this.f24867b = strArr;
        this.f24868c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24866a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f24867b;
        switch (i10) {
            case 0:
                he0.a(strArr, this.f24868c, this.d);
                return;
            default:
                he0.b(strArr, this.f24868c, this.d);
                return;
        }
    }
}
