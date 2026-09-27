package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class le0 implements Utilities.Callback {
    public final int f26036a;
    public final String[] f26037b;
    public final Activity f26038c;
    public final Utilities.Callback d;

    public le0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f26036a = i10;
        this.f26037b = strArr;
        this.f26038c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26036a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f26037b;
        switch (i10) {
            case 0:
                ne0.a(strArr, this.f26038c, this.d);
                return;
            default:
                ne0.b(strArr, this.f26038c, this.d);
                return;
        }
    }
}
