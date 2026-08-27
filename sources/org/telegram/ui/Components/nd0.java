package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;

public final class nd0 implements Utilities.Callback {

    public final int f30958a;

    public final String[] f30959b;

    public final Activity f30960c;
    public final Utilities.Callback d;

    public nd0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f30958a = i10;
        this.f30959b = strArr;
        this.f30960c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f30958a;
        String[] strArr = this.f30959b;
        switch (i10) {
            case 0:
                pd0.a(strArr, this.f30960c, this.d);
                break;
            default:
                pd0.b(strArr, this.f30960c, this.d);
                break;
        }
    }
}
