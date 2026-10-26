package org.telegram.ui.Components;
public final class vb1 {
    public final cb1 f33623a;
    public final wb1[] f33624b;
    public final double f33625c;
    public final int d;
    public final int e;
    public final dc1 f33626f;
    public final boolean f33627g;
    public final boolean h;

    public vb1(cb1 cb1Var, wb1[] wb1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, dc1 dc1Var, boolean z10, boolean z11) {
        this.f33626f = dc1Var;
        this.f33627g = z10;
        this.h = z11;
        this.f33623a = cb1Var;
        this.f33624b = wb1VarArr;
        this.f33625c = d;
        this.d = i10;
        this.e = i11;
    }

    public final boolean a() {
        if (!this.f33623a.f()) {
            return false;
        }
        for (wb1 wb1Var : this.f33624b) {
            if (!wb1Var.f34403a.f()) {
                return false;
            }
        }
        return true;
    }
}
