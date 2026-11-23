package org.telegram.ui.Components;

import android.app.Activity;
public final class ad0 implements org.telegram.messenger.y10 {
    public final int f33500a;
    public final String[] f33501b;
    public final Activity f33502c;
    public final org.telegram.messenger.y10 d;

    public ad0(String[] strArr, Activity activity, org.telegram.messenger.y10 y10Var, int i7) {
        this.f33500a = i7;
        this.f33501b = strArr;
        this.f33502c = activity;
        this.d = y10Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.f33500a) {
            case 0:
                String[] strArr = this.f33501b;
                int length = strArr.length;
                boolean z10 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (this.f33502c.checkSelfPermission(strArr[i7]) == 0) {
                            z10 = true;
                        } else {
                            i7++;
                        }
                    }
                }
                org.telegram.messenger.y10 y10Var = this.d;
                if (y10Var != null) {
                    y10Var.a(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                String[] strArr2 = this.f33501b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        if (this.f33502c.checkSelfPermission(strArr2[i10]) == 0) {
                            i10++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                org.telegram.messenger.y10 y10Var2 = this.d;
                if (y10Var2 != null) {
                    y10Var2.a(Boolean.valueOf(z11));
                    return;
                }
                return;
        }
    }
}
