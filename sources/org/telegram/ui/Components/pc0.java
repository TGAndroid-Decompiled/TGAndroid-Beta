package org.telegram.ui.Components;
public final class pc0 implements org.telegram.messenger.ls {
    public final int f36868a;
    public final org.telegram.messenger.c20 f36869b;
    public final org.telegram.messenger.ls[] f36870c;

    public pc0(int i7, org.telegram.messenger.c20 c20Var, org.telegram.messenger.ls[] lsVarArr) {
        this.f36868a = i7;
        this.f36869b = c20Var;
        this.f36870c = lsVarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25047p5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f36868a) {
                org.telegram.messenger.c20 c20Var = this.f36869b;
                if (c20Var != null) {
                    c20Var.a(iArr);
                }
                org.telegram.messenger.qs.e().n(this.f36870c[0], i11);
            }
        }
    }
}
