package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class je0 implements Utilities.Callback {
    public final int f25354a;
    public final String[] f25355b;
    public final Activity f25356c;
    public final Utilities.Callback d;

    public je0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f25354a = i10;
        this.f25355b = strArr;
        this.f25356c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f25354a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f25355b;
        switch (i10) {
            case 0:
                le0.a(strArr, this.f25356c, this.d);
                return;
            default:
                le0.b(strArr, this.f25356c, this.d);
                return;
        }
    }
}
