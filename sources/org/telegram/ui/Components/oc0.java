package org.telegram.ui.Components;

import android.app.Activity;
public final class oc0 implements org.telegram.messenger.c20 {
    public final int f36614a;
    public final String[] f36615b;
    public final Activity f36616c;
    public final org.telegram.messenger.c20 d;

    public oc0(String[] strArr, Activity activity, org.telegram.messenger.c20 c20Var, int i7) {
        this.f36614a = i7;
        this.f36615b = strArr;
        this.f36616c = activity;
        this.d = c20Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.f36614a) {
            case 0:
                String[] strArr = this.f36615b;
                int length = strArr.length;
                boolean z9 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (this.f36616c.checkSelfPermission(strArr[i7]) == 0) {
                            z9 = true;
                        } else {
                            i7++;
                        }
                    }
                }
                org.telegram.messenger.c20 c20Var = this.d;
                if (c20Var != null) {
                    c20Var.a(Boolean.valueOf(z9));
                    return;
                }
                return;
            default:
                String[] strArr2 = this.f36615b;
                int length2 = strArr2.length;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        if (this.f36616c.checkSelfPermission(strArr2[i10]) == 0) {
                            i10++;
                        }
                    } else {
                        z10 = true;
                    }
                }
                org.telegram.messenger.c20 c20Var2 = this.d;
                if (c20Var2 != null) {
                    c20Var2.a(Boolean.valueOf(z10));
                    return;
                }
                return;
        }
    }
}
