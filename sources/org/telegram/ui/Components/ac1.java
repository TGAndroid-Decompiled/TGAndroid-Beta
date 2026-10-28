package org.telegram.ui.Components;
public final class ac1 {
    public final db1 f26505a;
    public final bc1[] f26506b;
    public final double f26507c;
    public final int d;
    public final int e;
    public final ic1 f26508f;
    public final boolean f26509g;
    public final boolean h;

    public ac1(db1 db1Var, bc1[] bc1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, ic1 ic1Var, boolean z10, boolean z11) {
        this.f26508f = ic1Var;
        this.f26509g = z10;
        this.h = z11;
        this.f26505a = db1Var;
        this.f26506b = bc1VarArr;
        this.f26507c = d;
        this.d = i10;
        this.e = i11;
    }

    public final boolean a() {
        if (!this.f26505a.f()) {
            return false;
        }
        for (bc1 bc1Var : this.f26506b) {
            if (!bc1Var.f26803a.f()) {
                return false;
            }
        }
        return true;
    }
}
