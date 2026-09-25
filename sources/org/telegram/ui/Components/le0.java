package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class le0 implements Utilities.Callback {
    public final int f26083a;
    public final String[] f26084b;
    public final Activity f26085c;
    public final Utilities.Callback d;

    public le0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f26083a = i10;
        this.f26084b = strArr;
        this.f26085c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26083a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f26084b;
        switch (i10) {
            case 0:
                ne0.a(strArr, this.f26085c, this.d);
                return;
            default:
                ne0.b(strArr, this.f26085c, this.d);
                return;
        }
    }
}
