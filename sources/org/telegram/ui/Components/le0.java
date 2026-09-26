package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class le0 implements Utilities.Callback {
    public final int f26082a;
    public final String[] f26083b;
    public final Activity f26084c;
    public final Utilities.Callback d;

    public le0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f26082a = i10;
        this.f26083b = strArr;
        this.f26084c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26082a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f26083b;
        switch (i10) {
            case 0:
                ne0.a(strArr, this.f26084c, this.d);
                return;
            default:
                ne0.b(strArr, this.f26084c, this.d);
                return;
        }
    }
}
