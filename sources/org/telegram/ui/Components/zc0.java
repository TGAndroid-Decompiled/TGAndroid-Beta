package org.telegram.ui.Components;

import android.app.Activity;
public final class zc0 implements org.telegram.messenger.x10 {
    public final int f42869a;
    public final String[] f42870b;
    public final Activity f42871c;
    public final org.telegram.messenger.x10 d;

    public zc0(String[] strArr, Activity activity, org.telegram.messenger.x10 x10Var, int i7) {
        this.f42869a = i7;
        this.f42870b = strArr;
        this.f42871c = activity;
        this.d = x10Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.f42869a) {
            case 0:
                String[] strArr = this.f42870b;
                int length = strArr.length;
                boolean z10 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (this.f42871c.checkSelfPermission(strArr[i7]) == 0) {
                            z10 = true;
                        } else {
                            i7++;
                        }
                    }
                }
                org.telegram.messenger.x10 x10Var = this.d;
                if (x10Var != null) {
                    x10Var.a(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                String[] strArr2 = this.f42870b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        if (this.f42871c.checkSelfPermission(strArr2[i10]) == 0) {
                            i10++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                org.telegram.messenger.x10 x10Var2 = this.d;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.valueOf(z11));
                    return;
                }
                return;
        }
    }
}
