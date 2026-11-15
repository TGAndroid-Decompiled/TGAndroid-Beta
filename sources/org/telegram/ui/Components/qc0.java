package org.telegram.ui.Components;
public final class qc0 implements org.telegram.messenger.is {
    public final int f38627a;
    public final org.telegram.messenger.z10 f38628b;
    public final org.telegram.messenger.is[] f38629c;

    public qc0(int i7, org.telegram.messenger.z10 z10Var, org.telegram.messenger.is[] isVarArr) {
        this.f38627a = i7;
        this.f38628b = z10Var;
        this.f38629c = isVarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25552p5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f38627a) {
                org.telegram.messenger.z10 z10Var = this.f38628b;
                if (z10Var != null) {
                    z10Var.a(iArr);
                }
                org.telegram.messenger.ns.e().n(this.f38629c[0], i11);
            }
        }
    }
}
