package org.telegram.ui.Components;

import android.app.Activity;
public final class jd0 implements org.telegram.messenger.q20 {
    public final int f27332a;
    public final String[] f27333b;
    public final Activity f27334c;
    public final org.telegram.messenger.q20 d;

    public jd0(String[] strArr, Activity activity, org.telegram.messenger.q20 q20Var, int i10) {
        this.f27332a = i10;
        this.f27333b = strArr;
        this.f27334c = activity;
        this.d = q20Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.f27332a) {
            case 0:
                String[] strArr = this.f27333b;
                int length = strArr.length;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (this.f27334c.checkSelfPermission(strArr[i10]) == 0) {
                            z10 = true;
                        } else {
                            i10++;
                        }
                    }
                }
                org.telegram.messenger.q20 q20Var = this.d;
                if (q20Var != null) {
                    q20Var.a(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                String[] strArr2 = this.f27333b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        if (this.f27334c.checkSelfPermission(strArr2[i11]) == 0) {
                            i11++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                org.telegram.messenger.q20 q20Var2 = this.d;
                if (q20Var2 != null) {
                    q20Var2.a(Boolean.valueOf(z11));
                    return;
                }
                return;
        }
    }
}
