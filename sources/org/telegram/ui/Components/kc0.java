package org.telegram.ui.Components;
public final class kc0 implements org.telegram.messenger.cs {
    public final int f35365a;
    public final org.telegram.messenger.u10 f35366b;
    public final org.telegram.messenger.cs[] f35367c;

    public kc0(int i3, org.telegram.messenger.u10 u10Var, org.telegram.messenger.cs[] csVarArr) {
        this.f35365a = i3;
        this.f35366b = u10Var;
        this.f35367c = csVarArr;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23285p5;
        if (i3 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f35365a) {
                org.telegram.messenger.u10 u10Var = this.f35366b;
                if (u10Var != null) {
                    u10Var.a(iArr);
                }
                org.telegram.messenger.hs.e().n(this.f35367c[0], i11);
            }
        }
    }
}
