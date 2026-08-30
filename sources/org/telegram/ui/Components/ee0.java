package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ee0 implements Utilities.Callback {
    public final int f24559a;
    public final String[] f24560b;
    public final Activity f24561c;
    public final Utilities.Callback d;

    public ee0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f24559a = i10;
        this.f24560b = strArr;
        this.f24561c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24559a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f24560b;
        switch (i10) {
            case 0:
                ge0.a(strArr, this.f24561c, this.d);
                return;
            default:
                ge0.b(strArr, this.f24561c, this.d);
                return;
        }
    }
}
