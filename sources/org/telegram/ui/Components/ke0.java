package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ke0 implements Utilities.Callback {
    public final int f24701a;
    public final String[] f24702b;
    public final Activity f24703c;
    public final Utilities.Callback d;

    public ke0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f24701a = i10;
        this.f24702b = strArr;
        this.f24703c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24701a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f24702b;
        switch (i10) {
            case 0:
                me0.a(strArr, this.f24703c, this.d);
                return;
            default:
                me0.b(strArr, this.f24703c, this.d);
                return;
        }
    }
}
