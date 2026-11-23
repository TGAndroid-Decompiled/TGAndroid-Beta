package org.telegram.ui.Components;
public final class zc0 implements org.telegram.messenger.fs {
    public final int f42825a;
    public final org.telegram.messenger.w10 f42826b;
    public final org.telegram.messenger.fs[] f42827c;

    public zc0(int i7, org.telegram.messenger.w10 w10Var, org.telegram.messenger.fs[] fsVarArr) {
        this.f42825a = i7;
        this.f42826b = w10Var;
        this.f42827c = fsVarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.s5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f42825a) {
                org.telegram.messenger.w10 w10Var = this.f42826b;
                if (w10Var != null) {
                    w10Var.a(iArr);
                }
                org.telegram.messenger.ks.e().n(this.f42827c[0], i11);
            }
        }
    }
}
