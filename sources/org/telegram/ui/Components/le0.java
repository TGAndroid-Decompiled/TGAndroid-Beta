package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class le0 implements Utilities.Callback {
    public final int f26075a;
    public final String[] f26076b;
    public final Activity f26077c;
    public final Utilities.Callback d;

    public le0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f26075a = i10;
        this.f26076b = strArr;
        this.f26077c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26075a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f26076b;
        switch (i10) {
            case 0:
                ne0.a(strArr, this.f26077c, this.d);
                return;
            default:
                ne0.b(strArr, this.f26077c, this.d);
                return;
        }
    }
}
