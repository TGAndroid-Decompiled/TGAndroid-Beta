package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ne0 implements Utilities.Callback {
    public final int f26756a;
    public final String[] f26757b;
    public final Activity f26758c;
    public final Utilities.Callback d;

    public ne0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f26756a = i10;
        this.f26757b = strArr;
        this.f26758c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26756a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f26757b;
        switch (i10) {
            case 0:
                pe0.a(strArr, this.f26758c, this.d);
                return;
            default:
                pe0.b(strArr, this.f26758c, this.d);
                return;
        }
    }
}
