package org.telegram.ui.Components;
public final class qc0 implements org.telegram.messenger.ls {
    public final int f37287a;
    public final org.telegram.messenger.c20 f37288b;
    public final org.telegram.messenger.ls[] f37289c;

    public qc0(int i7, org.telegram.messenger.c20 c20Var, org.telegram.messenger.ls[] lsVarArr) {
        this.f37287a = i7;
        this.f37288b = c20Var;
        this.f37289c = lsVarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25056p5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f37287a) {
                org.telegram.messenger.c20 c20Var = this.f37288b;
                if (c20Var != null) {
                    c20Var.a(iArr);
                }
                org.telegram.messenger.qs.e().n(this.f37289c[0], i11);
            }
        }
    }
}
