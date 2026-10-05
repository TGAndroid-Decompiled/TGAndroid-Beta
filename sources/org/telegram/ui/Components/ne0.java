package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ne0 implements Utilities.Callback {
    public final int f29048a;
    public final String[] f29049b;
    public final Activity f29050c;
    public final Utilities.Callback d;

    public ne0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f29048a = i10;
        this.f29049b = strArr;
        this.f29050c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f29048a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f29049b;
        switch (i10) {
            case 0:
                pe0.a(strArr, this.f29050c, this.d);
                return;
            default:
                pe0.b(strArr, this.f29050c, this.d);
                return;
        }
    }
}
