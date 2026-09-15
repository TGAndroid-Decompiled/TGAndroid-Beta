package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class be0 implements Utilities.Callback {
    public final int f22772a;
    public final String[] f22773b;
    public final Activity f22774c;
    public final Utilities.Callback d;

    public be0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f22772a = i10;
        this.f22773b = strArr;
        this.f22774c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f22772a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f22773b;
        switch (i10) {
            case 0:
                de0.a(strArr, this.f22774c, this.d);
                return;
            default:
                de0.b(strArr, this.f22774c, this.d);
                return;
        }
    }
}
