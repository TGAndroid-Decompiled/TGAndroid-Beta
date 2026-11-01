package org.telegram.ui.Components;
public final class kd0 implements org.telegram.messenger.vs {
    public final int f27825a;
    public final org.telegram.messenger.r20 f27826b;
    public final org.telegram.messenger.vs[] f27827c;

    public kd0(int i10, org.telegram.messenger.r20 r20Var, org.telegram.messenger.vs[] vsVarArr) {
        this.f27825a = i10;
        this.f27826b = r20Var;
        this.f27827c = vsVarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.p5;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f27825a) {
                org.telegram.messenger.r20 r20Var = this.f27826b;
                if (r20Var != null) {
                    r20Var.a(iArr);
                }
                org.telegram.messenger.at.e().n(this.f27827c[0], i12);
            }
        }
    }
}
