package org.telegram.ui.Components;

import android.app.Activity;
public final class pc0 implements org.telegram.messenger.z10 {
    public final int f38281a;
    public final String[] f38282b;
    public final Activity f38283c;
    public final org.telegram.messenger.z10 d;

    public pc0(String[] strArr, Activity activity, org.telegram.messenger.z10 z10Var, int i7) {
        this.f38281a = i7;
        this.f38282b = strArr;
        this.f38283c = activity;
        this.d = z10Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.f38281a) {
            case 0:
                String[] strArr = this.f38282b;
                int length = strArr.length;
                boolean z10 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (this.f38283c.checkSelfPermission(strArr[i7]) == 0) {
                            z10 = true;
                        } else {
                            i7++;
                        }
                    }
                }
                org.telegram.messenger.z10 z10Var = this.d;
                if (z10Var != null) {
                    z10Var.a(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                String[] strArr2 = this.f38282b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        if (this.f38283c.checkSelfPermission(strArr2[i10]) == 0) {
                            i10++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                org.telegram.messenger.z10 z10Var2 = this.d;
                if (z10Var2 != null) {
                    z10Var2.a(Boolean.valueOf(z11));
                    return;
                }
                return;
        }
    }
}
