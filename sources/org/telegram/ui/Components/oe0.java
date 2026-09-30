package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class oe0 implements Utilities.Callback {
    public final int f27073a;
    public final String[] f27074b;
    public final Activity f27075c;
    public final Utilities.Callback d;

    public oe0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f27073a = i10;
        this.f27074b = strArr;
        this.f27075c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27073a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f27074b;
        switch (i10) {
            case 0:
                qe0.a(strArr, this.f27075c, this.d);
                return;
            default:
                qe0.b(strArr, this.f27075c, this.d);
                return;
        }
    }
}
