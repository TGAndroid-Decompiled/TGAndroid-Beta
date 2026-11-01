package org.telegram.ui.Components;

import android.app.Activity;
public final class jd0 implements org.telegram.messenger.r20 {
    public final int f27387a;
    public final String[] f27388b;
    public final Activity f27389c;
    public final org.telegram.messenger.r20 d;

    public jd0(String[] strArr, Activity activity, org.telegram.messenger.r20 r20Var, int i10) {
        this.f27387a = i10;
        this.f27388b = strArr;
        this.f27389c = activity;
        this.d = r20Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.f27387a) {
            case 0:
                String[] strArr = this.f27388b;
                int length = strArr.length;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (this.f27389c.checkSelfPermission(strArr[i10]) == 0) {
                            z10 = true;
                        } else {
                            i10++;
                        }
                    }
                }
                org.telegram.messenger.r20 r20Var = this.d;
                if (r20Var != null) {
                    r20Var.a(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                String[] strArr2 = this.f27388b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        if (this.f27389c.checkSelfPermission(strArr2[i11]) == 0) {
                            i11++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                org.telegram.messenger.r20 r20Var2 = this.d;
                if (r20Var2 != null) {
                    r20Var2.a(Boolean.valueOf(z11));
                    return;
                }
                return;
        }
    }
}
