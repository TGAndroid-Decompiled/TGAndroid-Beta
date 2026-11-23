package org.telegram.ui.Components;
public final class bd0 implements org.telegram.messenger.gs {
    public final int f33829a;
    public final org.telegram.messenger.y10 f33830b;
    public final org.telegram.messenger.gs[] f33831c;

    public bd0(int i7, org.telegram.messenger.y10 y10Var, org.telegram.messenger.gs[] gsVarArr) {
        this.f33829a = i7;
        this.f33830b = y10Var;
        this.f33831c = gsVarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.s5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f33829a) {
                org.telegram.messenger.y10 y10Var = this.f33830b;
                if (y10Var != null) {
                    y10Var.a(iArr);
                }
                org.telegram.messenger.ls.e().n(this.f33831c[0], i11);
            }
        }
    }
}
