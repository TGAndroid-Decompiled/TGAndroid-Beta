package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ke0 implements Utilities.Callback {
    public final int f25712a;
    public final String[] f25713b;
    public final Activity f25714c;
    public final Utilities.Callback d;

    public ke0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f25712a = i10;
        this.f25713b = strArr;
        this.f25714c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f25712a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f25713b;
        switch (i10) {
            case 0:
                me0.a(strArr, this.f25714c, this.d);
                return;
            default:
                me0.b(strArr, this.f25714c, this.d);
                return;
        }
    }
}
