package org.telegram.ui.Components;
public final class vb1 {
    public final cb1 f33620a;
    public final wb1[] f33621b;
    public final double f33622c;
    public final int d;
    public final int e;
    public final dc1 f33623f;
    public final boolean f33624g;
    public final boolean h;

    public vb1(cb1 cb1Var, wb1[] wb1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, dc1 dc1Var, boolean z10, boolean z11) {
        this.f33623f = dc1Var;
        this.f33624g = z10;
        this.h = z11;
        this.f33620a = cb1Var;
        this.f33621b = wb1VarArr;
        this.f33622c = d;
        this.d = i10;
        this.e = i11;
    }

    public final boolean a() {
        if (!this.f33620a.f()) {
            return false;
        }
        for (wb1 wb1Var : this.f33621b) {
            if (!wb1Var.f34400a.f()) {
                return false;
            }
        }
        return true;
    }
}
