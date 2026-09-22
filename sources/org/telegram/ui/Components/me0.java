package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class me0 implements Utilities.Callback {
    public final int f26441a;
    public final String[] f26442b;
    public final Activity f26443c;
    public final Utilities.Callback d;

    public me0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f26441a = i10;
        this.f26442b = strArr;
        this.f26443c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26441a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f26442b;
        switch (i10) {
            case 0:
                oe0.a(strArr, this.f26443c, this.d);
                return;
            default:
                oe0.b(strArr, this.f26443c, this.d);
                return;
        }
    }
}
