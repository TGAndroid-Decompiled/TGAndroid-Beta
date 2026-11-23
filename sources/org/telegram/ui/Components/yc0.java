package org.telegram.ui.Components;

import android.app.Activity;
public final class yc0 implements org.telegram.messenger.w10 {
    public final int f42426a;
    public final String[] f42427b;
    public final Activity f42428c;
    public final org.telegram.messenger.w10 d;

    public yc0(String[] strArr, Activity activity, org.telegram.messenger.w10 w10Var, int i7) {
        this.f42426a = i7;
        this.f42427b = strArr;
        this.f42428c = activity;
        this.d = w10Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.f42426a) {
            case 0:
                String[] strArr = this.f42427b;
                int length = strArr.length;
                boolean z10 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (this.f42428c.checkSelfPermission(strArr[i7]) == 0) {
                            z10 = true;
                        } else {
                            i7++;
                        }
                    }
                }
                org.telegram.messenger.w10 w10Var = this.d;
                if (w10Var != null) {
                    w10Var.a(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                String[] strArr2 = this.f42427b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        if (this.f42428c.checkSelfPermission(strArr2[i10]) == 0) {
                            i10++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                org.telegram.messenger.w10 w10Var2 = this.d;
                if (w10Var2 != null) {
                    w10Var2.a(Boolean.valueOf(z11));
                    return;
                }
                return;
        }
    }
}
