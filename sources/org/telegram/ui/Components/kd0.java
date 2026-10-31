package org.telegram.ui.Components;
public final class kd0 implements org.telegram.messenger.us {
    public final int f27732a;
    public final org.telegram.messenger.q20 f27733b;
    public final org.telegram.messenger.us[] f27734c;

    public kd0(int i10, org.telegram.messenger.q20 q20Var, org.telegram.messenger.us[] usVarArr) {
        this.f27732a = i10;
        this.f27733b = q20Var;
        this.f27734c = usVarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.p5;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f27732a) {
                org.telegram.messenger.q20 q20Var = this.f27733b;
                if (q20Var != null) {
                    q20Var.a(iArr);
                }
                org.telegram.messenger.zs.e().n(this.f27734c[0], i12);
            }
        }
    }
}
