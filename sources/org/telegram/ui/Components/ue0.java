package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ue0 implements Utilities.Callback {
    public final int f30947a;
    public final String[] f30948b;
    public final Activity f30949c;
    public final Utilities.Callback d;

    public ue0(String[] strArr, Activity activity, Utilities.Callback callback, int i10) {
        this.f30947a = i10;
        this.f30948b = strArr;
        this.f30949c = activity;
        this.d = callback;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.f30947a) {
            case 0:
                String[] strArr = this.f30948b;
                int length = strArr.length;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (this.f30949c.checkSelfPermission(strArr[i10]) == 0) {
                            z10 = true;
                        } else {
                            i10++;
                        }
                    }
                }
                Utilities.Callback callback = this.d;
                if (callback != null) {
                    callback.run(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                String[] strArr2 = this.f30948b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        if (this.f30949c.checkSelfPermission(strArr2[i11]) == 0) {
                            i11++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                Utilities.Callback callback2 = this.d;
                if (callback2 != null) {
                    callback2.run(Boolean.valueOf(z11));
                    return;
                }
                return;
        }
    }
}
