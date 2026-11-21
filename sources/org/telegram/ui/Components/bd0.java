package org.telegram.ui.Components;
public final class bd0 implements org.telegram.messenger.fs {
    public final int f33836a;
    public final org.telegram.messenger.x10 f33837b;
    public final org.telegram.messenger.fs[] f33838c;

    public bd0(int i7, org.telegram.messenger.x10 x10Var, org.telegram.messenger.fs[] fsVarArr) {
        this.f33836a = i7;
        this.f33837b = x10Var;
        this.f33838c = fsVarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.s5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f33836a) {
                org.telegram.messenger.x10 x10Var = this.f33837b;
                if (x10Var != null) {
                    x10Var.a(iArr);
                }
                org.telegram.messenger.ks.e().n(this.f33838c[0], i11);
            }
        }
    }
}
