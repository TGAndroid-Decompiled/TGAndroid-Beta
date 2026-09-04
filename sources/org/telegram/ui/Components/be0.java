package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class be0 implements Utilities.Callback {
    public final int f24688a;
    public final String[] f24689b;
    public final Activity f24690c;
    public final Utilities.Callback d;

    public be0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f24688a = i10;
        this.f24689b = strArr;
        this.f24690c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24688a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f24689b;
        switch (i10) {
            case 0:
                de0.a(strArr, this.f24690c, this.d);
                return;
            default:
                de0.b(strArr, this.f24690c, this.d);
                return;
        }
    }
}
