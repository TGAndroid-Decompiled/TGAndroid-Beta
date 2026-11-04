package org.telegram.ui.Components;

import android.app.Activity;
public final class jc0 implements org.telegram.messenger.u10 {
    public final int f35040a;
    public final String[] f35041b;
    public final Activity f35042c;
    public final org.telegram.messenger.u10 d;

    public jc0(String[] strArr, Activity activity, org.telegram.messenger.u10 u10Var, int i3) {
        this.f35040a = i3;
        this.f35041b = strArr;
        this.f35042c = activity;
        this.d = u10Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.f35040a) {
            case 0:
                String[] strArr = this.f35041b;
                int length = strArr.length;
                boolean z10 = false;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (this.f35042c.checkSelfPermission(strArr[i3]) == 0) {
                            z10 = true;
                        } else {
                            i3++;
                        }
                    }
                }
                org.telegram.messenger.u10 u10Var = this.d;
                if (u10Var != null) {
                    u10Var.a(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                String[] strArr2 = this.f35041b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        if (this.f35042c.checkSelfPermission(strArr2[i10]) == 0) {
                            i10++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                org.telegram.messenger.u10 u10Var2 = this.d;
                if (u10Var2 != null) {
                    u10Var2.a(Boolean.valueOf(z11));
                    return;
                }
                return;
        }
    }
}
