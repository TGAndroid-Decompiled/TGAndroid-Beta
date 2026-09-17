package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class be0 implements Utilities.Callback {
    public final int f24689a;
    public final String[] f24690b;
    public final Activity f24691c;
    public final Utilities.Callback d;

    public be0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f24689a = i10;
        this.f24690b = strArr;
        this.f24691c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24689a;
        int[] iArr = (int[]) obj;
        String[] strArr = this.f24690b;
        switch (i10) {
            case 0:
                de0.a(strArr, this.f24691c, this.d);
                return;
            default:
                de0.b(strArr, this.f24691c, this.d);
                return;
        }
    }
}
