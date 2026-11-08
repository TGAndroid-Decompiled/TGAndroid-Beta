package org.telegram.ui.Components;
public final class pc0 implements org.telegram.messenger.ls {
    public final int f36894a;
    public final org.telegram.messenger.c20 f36895b;
    public final org.telegram.messenger.ls[] f36896c;

    public pc0(int i7, org.telegram.messenger.c20 c20Var, org.telegram.messenger.ls[] lsVarArr) {
        this.f36894a = i7;
        this.f36895b = c20Var;
        this.f36896c = lsVarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25056p5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f36894a) {
                org.telegram.messenger.c20 c20Var = this.f36895b;
                if (c20Var != null) {
                    c20Var.a(iArr);
                }
                org.telegram.messenger.qs.e().n(this.f36896c[0], i11);
            }
        }
    }
}
